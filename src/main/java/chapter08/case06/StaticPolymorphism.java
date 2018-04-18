package chapter08.case06;
import static chapter06.case01.Print.print;
/**
 * 静态函数不可使用多态性
 */
public class StaticPolymorphism {
    public static void main(String[] args){
        StaticSuper sup = new StaticSub();//上溯造型
        print(sup.staticGet());
        print(sup.dynamicGet());
        /*
        * output:
        * Base staticGet()
        * Derived dynamicGet()
        * **/

    }
}
