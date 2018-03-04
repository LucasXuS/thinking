package chapter09.case01;

/**
 * 抽象类
 * <p>
 * 抽象类的对象几乎没有任何意义，我们希望通过抽象类来操纵一系列类。
 * 与此同时，抽象类有可能只表示一个底层的抽象含义，我们也试图阻止
 * 用户去创建一个抽象类对象。
 * <p>
 * 基于上述属性，有时候我们为了阻止用户产生某个类的对象，而设置这个
 * 类为抽象类，有可能这个抽象类没有任何抽象方法。
 */
public class Music4 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);

        /*
        * 本例除了把Instrument改成了抽象类，和chapter08.case03相比完全一致。
        * **/
    }
}
