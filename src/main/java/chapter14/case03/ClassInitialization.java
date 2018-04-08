package chapter14.case03;

import java.util.Random;

/**
 * Created by xusong on 2018/4/3.
 */
public class ClassInitialization {
    public static Random random = new Random(47);
    public static void main(String[] args){
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
    }
}
