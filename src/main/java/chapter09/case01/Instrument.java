package chapter09.case01;

/**
 * Created by lenovo on 2018/3/1.
 */
abstract class Instrument {
    private int i;

    abstract void play(Note note);

    String what() {
        return "Instrument";
    }

    abstract void adjust();
}
