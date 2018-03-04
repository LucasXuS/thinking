package chapter08.case11;
import static util.Print.print;
/**
 * Created by xusong on 2018/3/4.
 */
public class CovariantReturn {

    public static void main(String[] args){
        Mill m = new Mill();
        Grain g = m.process();
        print(g);
        m = new WheatMill();
        g = m.process();
        print(g);

        /*
        * output:
        * Grain
        * Wheat
        *
        * **/

        /*
        * covariant 协变，即共同变化
        *
        * 可以利用多态性，在派生类中重写基类的某个函数，并且返回基类函数的返回类型的子类型。
        * **/

    }
}
