package chapter07.case13;

import java.util.Random;

/**
 * final 关键字：所表达的是：这是无法被改变的
 * final 的使用：数据，方法，类
 *
 * final 的目的：设计（确保某个参量或者函数是固定不变）或效率（final 是常量。减轻了运行时的负担）
 *
 * final 数据
 * final 数据有两种：
 * 1 final 常量：定义时必须对其赋值
 * 2 final 引用：引用所指向的对象不可变化，但是指向的对象却是可以被修改的。这一规则同样应用于数组。因为数组也是对象 。
 * 3 final static 将占据一段不可改变的内存空间。
 *
 * **/
public class FinalData {
    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    // 编译器常量：
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // 典型的共有常量（实践中大量使用）
    public static final int VALUE_THREE = 39;
    // 以下无法成为编译时常量：
    private final int i4 = random.nextInt(20);
    static final int INT_5 = random.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    // 数组
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return id + ": i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");

        // fd1.valueOne++;// 不能写，因为valueOne是个final，不可更改
        fd1.v2.i++;// 虽然v2是final，但是v2中的i不是final，所以可以修改。
        fd1.v1 = new Value(9); // v1 不是 final
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++; // 数组本身虽然为final 但是元素不是final
        }

        // fd1.v2 = new Value(0); // 不可，v2 是 final 不可给引用更换指向对象
        // fd1.VAL_3 = new Value(1); // 不可，VAL_3是 final 不可给引用更换指向对象
        // fd1.a = new int[3];// 不可，a是 final 不可给引用更换指向对象

        System.out.println(fd1);
        System.out.println("Creating new FinalData");

        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
        /**
         * output:
         * fd1: i4 = 15, INT_5 = 18
         * Creating new FinalData
         * fd1: i4 = 15, INT_5 = 18
         * fd2: i4 = 13, INT_5 = 18
         * */


    }

}
