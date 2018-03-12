package chapter11.case06;

import chapter14.caseX.Hamster;
import chapter14.caseX.Pet;
import chapter14.caseX.Rat;
import chapter14.caseY.Pets;

import java.util.LinkedList;

import static util.Print.print;

/**
 * LinkedList 和ArrayList 相比，在插入和删除元素中开销更小，
 * 但是在随机访问方面逊色一些。
 * <p>
 * LinkedList添加了可以使其用作栈，队列，或者双队列的方法。
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        print(pets);

        // getFirst() element() peek()的功能完全一致，都是取第一个元素，
        // 但是当列表为空时，getFirst() element()抛出 NoSuchElementException
        // peek()直接返回null
        print("pets.getFirst(): " + pets.getFirst());
        print("pets.element(): " + pets.element());
        print("pets.peek(): " + pets.peek());

        // removeFirst() remove() poll()的功能完全一致，都是删除第一个元素，并且返回被删除的元素，
        // 但是当列表为空时，removeFirst() remove()抛出 NoSuchElementException
        // poll()直接返回null
        print("pets.remove(): " + pets.remove());
        print("pets.removeFirst(): " + pets.removeFirst());
        print("pets.poll(): " + pets.poll());

        print(pets);

        // 在列表头部添加一个元素
        pets.addFirst(new Rat());
        print("After addFirst(): " + pets);


        // offer() add() addLast()功能相同，都是在列表尾部添加元素
        pets.offer(Pets.randomPet());
        print("After offer(): " + pets);

        pets.add(Pets.randomPet());
        print("After add(): " + pets);


        pets.addLast(new Hamster());
        print("After addLast(): " + pets);

        // 删除最后一个元素，并且返回被删除的元素
        print("pets.removeLast(): " + pets.removeLast());




    }
}
