package chapter12.case09;

/**
 * Created by lenovo on 2018/3/16.
 */
abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    }
}
