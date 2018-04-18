package chapter09.case10;

import static chapter06.case01.Print.print;

/**
 * Created by lenovo on 2018/3/5.
 */
public class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;

    public boolean move() {
        print("Checkers move " + moves);
        return ++moves != MOVES;
    }
}
