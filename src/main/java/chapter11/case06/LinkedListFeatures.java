package chapter11.case06;

import chapter14.caseX.Pet;
import chapter14.caseY.Pets;

import java.util.LinkedList;

/**
 * LinkedList 和ArrayList 相比，在插入和删除元素中开销更小，
 * 但是在随机访问方面逊色一些。
 * <p>
 * LinkedList添加了可以使其用作栈，队列，或者双队列的方法。
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));

    }
}
