package chapter09.case10;

import static chapter06.case01.Print.print;

/**
 * Created by lenovo on 2018/3/5.
 */
public class Chess implements Game{
    private int moves = 0;
    private static final int MOVES = 4;

    public boolean move() {
        print("Chess move " + moves);
        return ++moves != MOVES;
    }
}
