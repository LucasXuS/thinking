package chapter09.case02;

/**
 * 接口
 *
 * 抽象类中既可以有抽象函数，也可以有实实在在的函数，
 * 但是接口却将此做到了极致，是极度抽象的，所有方法
 * 都没有给出具体的实现。由于其纯粹性，所以类可以实
 * 现多个接口。
 *
 * 一个接口表示"实现了该接口的类应该看起来都像这样"
 * 因此接口一般用作类与类之间的协议
 *
 * 接口里面可以包含属性，但是这些属性都是默认final
 * 和static的
 *
 *
 */
public class Music5 {
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
        * 本例除了把Instrument改成了接口，
        * 为了简化接口，将what去掉，使用Object的toString()
        * 除此之外，和chapter08.case03相比完全一致。
        * **/
    }
}
