package chapter11.case05;

import chapter14.case06.Pet;
import chapter14.caseY.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator: Iterator的派生类
 *
 *
 */
public class ListIteration {

    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext())
            System.out.print(it.next() + ", " + it.nextIndex()
                    + ", " + it.previousIndex() + "; ");

        /*
        * ListIterator 的数组指针的移动还是来自于next()
        * nextIndex()并不能移动数组指针。
        *
        * **/
        System.out.println();
        // 双向遍历
        while (it.hasPrevious()){
            System.out.print(it.previous().id() + " ");
        }
        System.out.println();
        System.out.println(pets);
        // 从位置3开始遍历
        it = pets.listIterator(3);
        while (it.hasNext()){
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);



    }
}
