package chapter10.case15;

/**
 * 接口方式
 */
public class Callee1 implements Incrementable {
    private int i = 0;

    public void increment() {
        i++;
        System.out.println(i);
    }
}
