package chapter10.case18;

/**
 * 内部类的覆盖
 * <p>
 * 如果我们想明确让子类的内部类覆盖基类的内部类，就要明确的写明两个内部类的继承关系
 */
public class BigEgg2 extends Egg2 {
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            System.out.println("BigEgg2.Yolk()");
        }

        @Override
        public void f() {
            System.out.println("BigEgg2.Yolk.f()");
        }

    }

    public BigEgg2() {
        insertYolk(new Yolk());
    }

    public static void main(String[] args){
        Egg2 e2 = new BigEgg2();
        e2.g();
    }
}
