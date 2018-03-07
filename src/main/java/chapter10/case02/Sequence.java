package chapter10.case02;

/**
 * 当生成一个内部类的对象时，此对象与他的外围对象（外围类产生的对象）之间就有了一种联系。
 * 所以它能访问其外围对象的所有成员，而不需要任何特殊条件。
 * <p>
 * 内部类还拥有外围类的所有元素的访问权。
 * <p>
 * <p>
 * 另：
 * 1 如果该类不使用内部类，就必须声明“Sequence是一个Selector”对于某个特定的Sequence只能
 * 有一个Selector。而内部类就保证了通用性。而使用内部类，通过添加函数如“reverseSelector()”
 * 用它来生成一个反方向序列遍历的Selector.只有内部类才有此灵活性。
 */
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    // SequenceSelector的三个方法都用到了外围类的元素items
    // 所以SequenceSelector并不是一个纯粹的封闭的类。
    private class SequenceSelector implements Selector {

        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length)
                i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector reverseSelector() {
        return new Selector() {

            private int i = items.length - 1;

            public boolean end() {
                return i < 0;
            }

            public Object current() {
                return items[i];
            }

            public void next() {
                if (i >= 0)
                    i--;
            }
        };
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }

        Selector reverseSelector = sequence.reverseSelector();
        while (!reverseSelector.end()){
            System.out.println(reverseSelector.current() + " ");
            reverseSelector.next();
        }

        /*
        * 内部类访问外围类的元素的原理：
        * 当外围类对象创建了一个内部类的对象时，此内部类的对象会捕获一个
        * 指向外围类对象的引用。当我们使用内部类访问外围类的元素时，就是
        * 用这个引用来访问那些元素。
        *
        * **/
    }

}
