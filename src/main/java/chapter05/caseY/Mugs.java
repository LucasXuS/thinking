package chapter05.caseY;

/**
 * 实例初始化（代码块）
 */
public class Mugs {
    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int marker) {
        System.out.println("Mugs(" + marker + ")");
    }

    public static void main(String[] args){
        System.out.println("Inside main");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
        /*
        *
        * output:
        * Inside main
        * Mug(1)
        * Mug(2)
        * mug1 & mug2 initialized
        * Mugs()
        * new Mugs() completed
        * Mug(1)
        * Mug(2)
        * mug1 & mug2 initialized
        * Mugs(1)
        * new Mugs(1) completed
        *
        * */

        /*
         * 1 代码块运行时间早于构造函数
         * 2 非静态代码块会随着对象个数的增加多次运行
         *
         * */
    }
}
