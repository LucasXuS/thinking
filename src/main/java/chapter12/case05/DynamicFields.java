package chapter12.case05;

/**
 * 依靠initCause添加Caused by输出
 */
public class DynamicFields {
    private Object[][] fields;

    public DynamicFields(int initialSize) {
        fields = new Object[initialSize][2];
        for (int i = 0; i < initialSize; i++) {
            fields[i] = new Object[]{null, null};
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] obj : fields) {
            result.append(obj[0]);
            result.append(": ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }

    private int hasField(String id) {
        for (int i = 0; i < fields.length; i++)
            if (id.equals(fields[i][0]))
                return i;
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchFieldException {
        int filedNum = hasField(id);
        if (filedNum == -1)
            throw new NoSuchFieldException();
        return filedNum;
    }

    private int makeField(String id) {
        for (int i = 0; i < fields.length; i++)
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }

        Object[][] tmp = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; i++)
            tmp[i] = fields[i];
        tmp[fields.length] = new Object[]{null, null};
        fields = tmp;
        return makeField(id);

    }

    public Object getField(String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object value) throws DynamicFieldsException {
        if (value == null) {
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }
        int fieldNumber = hasField(id);
        if (fieldNumber == -1)
            fieldNumber = makeField(id);

        Object result = null;
        try {
            // 获取以前的值
            result = getField(id);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException();
        }
        fields[fieldNumber][1] = value;
        return result;
    }

    public static void main(String[] args) {
        DynamicFields df = new DynamicFields(3);
        System.out.println(df);
        try {
            df.setField("d", "A value for d");
            df.setField("number", 47);
            df.setField("number2", 48);
            System.out.println(df);
            df.setField("d", "A new value for d");
            df.setField("number3", 11);
            System.out.println("df: " + df);
            System.out.println("df.getField(\"d\"): " + df.getField("d"));
            Object field = df.setField("d", null);
        } catch (DynamicFieldsException | NoSuchFieldException e) {
            e.printStackTrace(System.out);
        }

        /*
        * 简要解释一下流程：一般来说，e.printStackTrace(System.out)只打印基本信息错误以及调用栈，如：
        * chapter12.case05.DynamicFieldsException
        *      at chapter12.case05.DynamicFields.setField(DynamicFields.java:63)
        *      at chapter12.case05.DynamicFields.main(DynamicFields.java:94)
        *
        * 但是Exception里面有个默认为空的参量叫做Throwable cause. initCause()函数就是为了初始化它
        * 当cause不为空的时候，在printStackTrace()函数中会传递“Caused by” 函数调用栈等信息再次打印一遍
        * 这样我们就看到Caused by 信息了
        *
        * **/
    }

}
