package chapter09.case04;

/**
 * 接口的多重继承以及接口的使用
 */
public class Adventure {

    // 多态。接口的使用方法
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
        /*
        * 这个例子所展示的就是使用接口的核心原因：为了能够向上转型，
        * 为多个基类型（以及由此带来的灵活性）。
        *
        * 其次还有个原因就是防止用户利用基类型创造对象。
        *
        * **/
    }

}
