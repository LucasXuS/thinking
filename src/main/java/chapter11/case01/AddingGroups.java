package chapter11.case01;

import java.util.*;
import static util.Print.*;

/**
 * 添加一组元素
 */
public class AddingGroups {

    public static void main(String[] args) {

        Collection<Integer> collection =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        Integer[] moreInts = {6, 7, 8, 9, 10};

        // 并不奇怪，因为asList 的参数类型是T... a 所以是一个泛型数组
        collection.addAll(Arrays.asList(moreInts));

        // 这个方法比前者速度快很多，是首选方式，但是有一点，这个函数无法初始化collection
        // 如果collection 是 null 会报错。
        Collections.addAll(collection, 1, 2, 3, 4, 5);

        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);

        // 修改元素
        list.set(1, 99);
        print(list);
        //list.add(11); // 这个list的底层是个数组，因此不能调整尺寸。
        // 底层是数组的原因是ArrayList实际上有两个，一个来自于ArrayList.java,
        // 一个来自于Arrays.java的内部类，后者是一个基于数组的类

        // Arrays中的ArrayList是通过 继承 AbstractList 继承 AbstractCollection (继承 List implements List)实现的。


    }
}
