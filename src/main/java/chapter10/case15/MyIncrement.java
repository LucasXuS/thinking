package chapter10.case15;

/**
 * Created by lenovo on 2018/3/9.
 */
public class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}
