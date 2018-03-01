package chapter08.case03;

import static util.Print.print;

/**
 * Created by lenovo on 2018/3/1.
 */
public class Woodwind extends Wind {
    @Override
    void play(Note note) {
        print("Woodwind.play() " + note);
    }

    @Override
    String what() {
        return "Woodwind";
    }

    @Override
    void adjust() {
        print("Adjusting Woodwind");
    }
}
