package chapter14.case03;

/**
 * Created by xusong on 2018/4/3.
 */
public class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}
