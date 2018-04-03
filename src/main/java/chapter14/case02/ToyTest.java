package chapter14.case02;

/**
 * Created by lenovo on 2018/4/3.
 */
public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            // 把包名写全，不然找不到。
            c = Class.forName("chapter14.case02.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("cannot find FancyToy");
            System.exit(1);
        }

        printInfo(c);

        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object object = null;
        try {
            object = c.newInstance();
        } catch (InstantiationException e) {
            // 无法实例化
            System.out.println("cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            // 无法接触
            System.out.println("cannot access");
            System.exit(1);
        }
        printInfo(object.getClass());
    }
}
