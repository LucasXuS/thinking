package chapter08.case01;


/**
 * 忘记对象类型
 */
public class Music {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
        Brass brass = new Brass();
        tune(brass);
        Stringed stringed = new Stringed();
        tune(stringed);
        /*
        * output:
        * Wind.play() MIDDLE_C
        * Brass.play() MIDDLE_C
        * Stringed.play() MIDDLE_C
        * **/

        /*
        * 上溯造型有助于我们忘记对象的类型，简化程序。
        * 当放弃用上溯造型时，可能会出现以下情况：
        * 当乐器的增多，我们要为每个乐器编写一个tune函数：如tune(Wind wind),tune(Brass brass)
        * 当我们使用上溯造型时，只需要一个tune(Instrument instrument)即可
        * **/


    }
}
