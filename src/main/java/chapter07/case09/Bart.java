package chapter07.case09;
import static util.Print.print;

/**
 * 名称屏蔽
 */
public class Bart  extends Homer{
    void doh(Milhouse milhouse){
        print("doh(Milhouse)");
    }

    public static void main(String[] args){
        Bart bart = new Bart();
        bart.doh(1);
        bart.doh('x');
        bart.doh(1.0f);
        bart.doh(new Milhouse());
        /**
         * output:
         * doh(float)
         * doh(char)
         * doh(float)
         * doh(Milhouse)
         *
         * */

        /**
         * 名称屏蔽就是把一些函数放在基类，在派生类生成的对象直接调用这些函数。
         *
         * 在实际应用中，我们把一些用共性的代码写在基类的函数中，在派生类中不再重复声明该函数，
         * 我们称之为代码下沉，让共性的代码在基类，保持派生类的简洁。
         *
         * */
    }
}
