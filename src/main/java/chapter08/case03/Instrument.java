package chapter08.case03;

import static chapter06.case01.Print.print;

/**
 * Created by lenovo on 2018/3/1.
 */
public class Instrument {
    void play(Note note) {
        print("Instrument.play() " + note);
    }

    String what(){
        return "Instrument";
    }

    void adjust(){
        print("Adjusting Instrument");
    }
}
