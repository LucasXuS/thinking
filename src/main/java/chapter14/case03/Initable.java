package chapter14.case03;

/**
 * Created by xusong on 2018/4/3.
 */
public class Initable {
    // 编译期常量，读取它不至于初始化Initable
    static final int staticFinal = 47;
    // 不是编译期常量，因此需要初始化Initable。
    static final int staticFinal2 = ClassInitialization.random.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}
