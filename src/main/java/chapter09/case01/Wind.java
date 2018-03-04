package chapter09.case01;

import static util.Print.print;

/**
 * Created by lenovo on 2018/3/1.
 */
public class Wind extends Instrument  {
    @Override
    void play(Note note) {
        print("Wind.play() " + note);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        print("Adjusting Wind");
    }
}
