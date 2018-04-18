package chapter09.case01;

import static chapter06.case01.Print.print;

/**
 * Created by lenovo on 2018/3/1.
 */
public class Stringed extends Instrument {
    @Override
    void play(Note note) {
        print("Stringed.play() " + note);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        print("Adjusting Stringed");
    }
}
