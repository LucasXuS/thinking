package chapter11.case08;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Set不保存重复的元素
 * HashSet专门为查找元素做了优化
 */
public class SetOfInteger {

    public static void main(String[] args) {

        Random random = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            intset.add(random.nextInt(30));
        }

        // 和书上不同，我用使用jdk 1.8运行程序，发现HashSet同样可以对数据进行排序。
        System.out.println(intset);
        /*
        * HashSet使用了散列去存储元素。
        * TreeSet使用了红黑树数据结构。
        *
        * **/
    }

}
