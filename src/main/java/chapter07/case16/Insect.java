package chapter07.case16;

import static chapter06.case01.Print.print;

/**
 * Created by xusong on 2018/3/1.
 */
public class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInt("static Insect.x1 initialized");

    static int printInt(String s) {
        print(s);
        return 47;
    }
}
