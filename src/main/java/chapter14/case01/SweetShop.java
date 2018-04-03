package chapter14.case01;

/**
 * 每创建一个类都会生成一个类对象，这个对象由JVM中的类加载器生成。
 * 加载：当程序创建第一个对类的静态成员的引用时，就会加载这个类
 *
 * 由此我们可以知道，构造器实际上是静态方法，即使没有static关键字。
 */


public class SweetShop {
    public static void main(String[] args){
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("chapter14.case01.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");

    }
}
