package chapter10.case07;

/**
 * Created by lenovo on 2018/3/7.
 */
abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor. i = " + i);
    }

    public abstract void f();
}
