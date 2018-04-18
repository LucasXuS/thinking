package chapter07.case05;
import static chapter06.case01.Print.*;

/**
 * Created by lenovo on 2018/2/26.
 */
public class Chess extends BoardGame {
    Chess(){
        super(11);
        print("Chess constructor");
    }

    public static void main(String[] args){
        Chess x = new Chess();

        /**
         * output:
         * BoardGame constructor with 11
         * BoardGame constructor with 11
         * Chess constructor
         * */

        /**
         * 1 如果基类仅声明了带参构造函数，而没有不戴参构造函数
         * 编译器会强制要求编写者在派生类中调用基类的构造函数
         *
         *
         * 2 派生类的构造函数无需与基类的构造函数一致。
         * **/

        /**
         * 从这里我们可以看出，初始化派生类时，编译器要确保“基类子对象”
         * 被成功创建。也可以侧面看出，基类子对象确实隐藏在派生类中。
         * */
    }
}
