package chapter05.caseX;

/**
 * 显式的静态初始化
 * 1 生成这个类的对象时会运行代码块
 * 2 调用静态对象前会调用代码块
 */
public class ExplicitSpace {

    public static void main(String[] args){
        System.out.println("Inside main");
        //code1
        Cups.cup1.f(99);
        /*
        * output:
        * Inside main
        * Cup(1)
        * Cup(2)
        * f(99)
        * */
    }
    //code2
    //static Cups cups1 = new Cups();
    //static Cups cups2 = new Cups();

    /*
    * 1 无论是直接初始化Cups(code2)还是调用Cups的静态对象(code1)，静态代码块的代码都会运行
    * 2 当code1 和 code2同时开启的时候，代码块只会运行一次。（参照静态初始化）
    * */
}
