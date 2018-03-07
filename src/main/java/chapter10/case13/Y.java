package chapter10.case13;

/**
 * Created by lenovo on 2018/3/7.
 */
public class Y implements A{
    B makeB(){
        return new B() {
        };
    }
}
