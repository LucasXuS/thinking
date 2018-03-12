package chapter11.case04;

import chapter14.caseX.Pet;
import chapter14.caseY.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * 迭代器是基于无视容器类型而直接使用各种容器的工具。
 * 比如，可以遍历List,同时在不改变代码的情况下还可以遍历Set
 * 创建迭代器的代价很小
 * <p>
 * 1 使用iterator()方法要求容器返回迭代器。Iterator将准备好返回序列的第一个元素
 * 2 使用next()获得序列中的下一个元素
 * 3 使用hasNext()检查序列中是否还有元素
 * 4 使用remove()将迭代器新近返回的元素删除
 */
public class SimpleIteration {

    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        // 生成迭代器
        Iterator<Pet> iterator = pets.iterator();

        // 判断是否还有元素
        while (iterator.hasNext()) {
            // 获取序列中的下一个元素
            // 创建后必须调用next()才能返回第一个元素
            Pet p = iterator.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
        // 如果在不修改元素的情况下，使用foreach更为简洁
        for (Pet p : pets) {
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();

        // iterator可以移除由next()产生的元素。因此在删除的时候必须先调用next()
        iterator = pets.iterator();
        for (int i = 0; i < 6; i++){
            iterator.next();
            iterator.remove();
        }

        /*
        * 另外Iterator是个内部类的好例子
        * Iterator 本身是个接口，几乎所有容器的内部都有个内部类去implements这个接口
        * 然后在内部类中去实现next() hasNext() remove()等方法（内部类改动外围类）。
        * 最后通过iterator()进行上溯造型，然后返回迭代器。
        *
        * **/

    }
}
