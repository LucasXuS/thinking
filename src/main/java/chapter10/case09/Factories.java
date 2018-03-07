package chapter10.case09;

/**
 * 利用匿名内部类优化chapter09.case09
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
        /*
        * output:
        * Implementation1 method1
        * Implementation1 method2
        * Implementation2 method1
        * Implementation2 method2
        *
        * **/
    }
}
