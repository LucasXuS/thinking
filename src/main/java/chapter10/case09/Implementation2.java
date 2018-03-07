package chapter10.case09;

/**
 * Created by lenovo on 2018/3/7.
 */
public class Implementation2 implements Service {
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    public void method2() {
        System.out.println("Implementation2 method2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
        public Service getService() {
            return new Implementation2();
        }
    };
}
