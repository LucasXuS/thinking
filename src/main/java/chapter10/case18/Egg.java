package chapter10.case18;

/**
 * Created by xusong on 2018/3/11.
 */
public class Egg {
    private Yolk y;

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }

    }

    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}
