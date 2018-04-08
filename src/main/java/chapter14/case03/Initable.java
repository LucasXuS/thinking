package chapter14.case03;

/**
 * Created by xusong on 2018/4/3.
 */
public class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.random.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}
