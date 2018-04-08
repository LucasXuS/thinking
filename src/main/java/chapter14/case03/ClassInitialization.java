package chapter14.case03;

import java.util.Random;

/**
 * 调用静态常量可能导致类的初始化。
 */
public class ClassInitialization {
    public static Random random = new Random(47);
    public static void main(String[] args){
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        // 并没有初始化
        System.out.println(Initable.staticFinal);
        // Initable初始化
        System.out.println(Initable.staticFinal2);
    }
}
