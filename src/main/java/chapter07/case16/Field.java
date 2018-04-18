package chapter07.case16;

import static chapter06.case01.Print.print;

/**
 * 为了验证，如果变量不存在静态，依然是主函数先运行。
 */
public class Field {


    public static void main(String[] args){
        print("Beetle constructor");
        Beetle b = new Beetle();

        /*
        * output:
        * Beetle constructor
        * static Insect.x1 initialized
        * static Beetle.x2 initialized
        * i = 9, j = 0
        * Beetle.k initialized
        * k = 47
        * j = 39
        *
        *
        * **/
    }
}
