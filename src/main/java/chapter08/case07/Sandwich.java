package chapter08.case07;

import static util.Print.print;

/**
 * 构造器和多态
 * “上溯造型”给了我们一个解释为何派生类构造之前要确保基类运行构造函数。
 * 由于在上溯造型的时候，我们不仅需要了解该类型的全部，也要同时了解其基类
 * 的全部。
 */
public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    Sandwich() {
        print("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
        /*
        * output:
        * Meal()
        * Lunch()
        * PortableLunch()
        * Bread()
        * Cheese()
        * Lettuce()
        * Sandwich()
        * **/

        /*
        * 1 调用基类构造器，反复递归，直到族谱最底层的类
        * 2 按照声明顺序调用成员的初始化方法
        * 3 调用派生类构造器的主体
        *
        *
        * **/
    }
}
