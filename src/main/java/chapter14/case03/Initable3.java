package chapter14.case03;

/**
 * Created by xusong on 2018/4/3.
 */
public class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}
