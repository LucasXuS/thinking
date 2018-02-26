package chapter07.case04;

/**
 * 基类的初始化
 */
public class Cartoon extends Drawing {
    public Cartoon(){
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args){
        Cartoon x = new Cartoon();

        /*
        * output:
        * Art constructor
        * Drawing constructor
        * Cartoon constructor
        *
        * **/

        /*
        *
        * 1 我们在创建派生类的对象时，实际上创建了“基类子对象”
        * 2 这种基类子对象来自于派生类对象的内部
        * 3 对象创建顺序是向外扩散的，优先创建基类子对象
        * **/
    }


}
