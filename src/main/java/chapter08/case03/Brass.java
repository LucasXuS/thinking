package chapter08.case03;

import static chapter06.case01.Print.print;

/**
 * Created by lenovo on 2018/3/1.
 */
public class Brass extends Wind{
    @Override
    void play(Note note) {
        print("Brass.play() " + note);
    }

    @Override
    String what() {
        return "Brass";
    }

    @Override
    void adjust() {
        print("Adjusting Brass");
    }
}
