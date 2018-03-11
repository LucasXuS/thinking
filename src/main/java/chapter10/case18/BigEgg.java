package chapter10.case18;

/**
 * 内部类的覆盖
 *
 * 在这里我们可以发现内部类是不能被覆盖的，两个Yolk的关系就像是两个命名空间中名称一样的类。
 */
public class BigEgg extends Egg {
    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }

    }

    public static void main(String[] args) {
        new BigEgg();
    }


}
