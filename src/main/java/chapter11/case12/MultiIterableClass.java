package chapter11.case12;

import java.util.*;

/**
 * foreach的遍历顺序是默认的，但是，如果我希望能够用多种方法
 * 进行遍历，就要创建很多对象，在每个对象中创建不同的匿名内部
 * 类，以产生不同的迭代器，而是不能实现选择。
 * <p>
 * 解决的方法是使用适配器方法。我们在这里不使用覆盖，而是
 * 添加一个能够产生Iterable对象的方法，这个对象可以用于
 * foreach语句
 * <p>
 * 本例是基于数组的自创容器
 */
public class MultiIterableClass extends IterableClass {

    public Iterable<String> reversed() {
        return () -> new Iterator<String>() {
            int current = words.length - 1;

            @Override
            public boolean hasNext() {
                return current > -1;
            }

            @Override
            public String next() {
                return words[current--];
            }
        };
    }

    public Iterable<String> randomized() {
        return () -> {
            List<String> shuffled =
                    new ArrayList<>(Arrays.asList(words));
            Collections.shuffle(shuffled, new Random(47));

            return shuffled.iterator();
        };
    }

    public static void main(String[] args){
        MultiIterableClass mic = new MultiIterableClass();
        for (String s : mic.reversed())
            System.out.print(s + " ");
        System.out.println();
        for (String s : mic.randomized())
            System.out.print(s + " ");
        System.out.println();
        for (String s : mic)
            System.out.print(s + " ");
        System.out.println();
    }
}



















