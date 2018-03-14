package chapter12.case02;

/**
 * Exception中的 getMessage()
 */
public class ExtraFeatures {
    public static void f() throws MyException2 {
        System.out.println("Throwing MyException2 from f()");
        // 我们甚至可以很“肤浅”地认为throw 的作用类似return
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        System.out.println("Throwing MyException2 from g()");
        throw new MyException2("Originated in g()");
    }

    public static void h() throws MyException2 {
        System.out.println("Throwing MyException2 from h()");
        throw new MyException2("Originated in g()", 47);
    }

    public static void main(String[] args){
        try {
            f();
        }catch (MyException2 e){
            e.printStackTrace(System.out);
        }
        try {
            g();
        }catch (MyException2 e){
            e.printStackTrace(System.out);
        }
        try {
            h();
        }catch (MyException2 e){
            e.printStackTrace(System.out);
        }

        /*
        * 可见，getMessage()的作用是打印new Exception(String s)中的
        * s时，去获取s的函数。我们重写后，就可以改变打印格式和标准。
        *
        * getMessage() 一样来自于类 Throwable
        * **/
    }
}
