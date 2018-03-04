package chapter09.case02;

/**
 * Created by lenovo on 2018/3/1.
 */
interface Instrument {
    // 默认是static和final的
    int VALUE = 5;

    void play(Note note);

    void adjust();
}
