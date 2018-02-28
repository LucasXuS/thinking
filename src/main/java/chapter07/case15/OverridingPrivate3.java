package chapter07.case15;

import static util.Print.print;

/**
 * Created by xusong on 2018/2/28.
 */
public class OverridingPrivate3 extends OverridingPrivate2 {
    public void f(){
        print("OverridingPrivate3.f()");
    }

    public void g(){
        print("OverridingPrivate3.g()");
    }
}
