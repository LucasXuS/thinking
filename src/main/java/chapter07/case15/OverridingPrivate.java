package chapter07.case15;
import static util.Print.print;
/**
 * Created by xusong on 2018/2/28.
 */
public class OverridingPrivate extends WithFinals{

    private void f(){
        print("OverridingPrivate.f()");
    }

    private void g(){
        print("OverridingPrivate.g()");
    }
}
