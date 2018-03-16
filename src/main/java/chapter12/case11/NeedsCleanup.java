package chapter12.case11;

/**
 * Created by xusong on 2018/3/16.
 */
public class NeedsCleanup {

    // 这是为共用对象的一个编号套路
    private static long counter = 1;
    private final long id = counter++;

    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }

}
