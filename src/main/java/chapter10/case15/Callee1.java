package chapter10.case15;

/**
 * Created by lenovo on 2018/3/9.
 */
public class Callee1 implements Incrementable {
    private int i = 0;

    public void increment() {
        i++;
        System.out.println(i);
    }
}
