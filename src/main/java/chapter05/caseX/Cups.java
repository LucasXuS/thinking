package chapter05.caseX;

/**
 * Created by xusong on 2018/2/25.
 */
public class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups");
    }
}
