package chapter08.case03;

import static util.Print.print;

/**
 * Created by lenovo on 2018/3/1.
 */
public class Percussion extends Instrument {
    @Override
    void play(Note note) {
        print("Percussion.play() " + note);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        print("Adjusting Percussion");
    }
}
