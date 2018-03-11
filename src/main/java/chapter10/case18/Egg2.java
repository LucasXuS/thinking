package chapter10.case18;

/**
 * Created by xusong on 2018/3/11.
 */
public class Egg2 {
    private Yolk y;

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk()");
        }

        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }

    }

    public Egg2() {
        System.out.println("New Egg2()");
    }

    public void insertYolk(Yolk y) {
        this.y = y;
    }

    public void g() {
        y.f();
    }
}
