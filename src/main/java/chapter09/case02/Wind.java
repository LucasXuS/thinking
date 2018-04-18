package chapter09.case02;

import static chapter06.case01.Print.print;

/**
 * Created by lenovo on 2018/3/1.
 */
public class Wind implements Instrument  {
    @Override
    public void play(Note note) {
        print(this + ".play() " + note);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        print("Adjusting " + this);
    }
}
