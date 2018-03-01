package chapter08.case03;

/**
 * 多态增强了程序的可扩展性
 */
public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e){
        for(Instrument i : e){
            tune(i);
        }
    }

    public static void main(String[] args){
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
        /*
        * output:
        * Percussion.play() MIDDLE_C
        * Percussion.play() MIDDLE_C
        * Stringed.play() MIDDLE_C
        * Brass.play() MIDDLE_C
        * Woodwind.play() MIDDLE_C
        *
        * **/

        /*
        * 本例是基于case01的一次加工。
        * 相对于case01:
        * 1 我们加入了更多的对象
        * 2 我们给对象加入了更多的方法
        * 但是tune()仍然不需要任何变化，不受任何影响。
        * 多态可以让“改变的事物和未变的事物分离开来”
        * **/
    }
}
