package chapter08.case01;

import static chapter06.case01.Print.print;

/**
 * Created by lenovo on 2018/3/1.
 */
public class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        print("Stringed.play() " + n);
    }
}
