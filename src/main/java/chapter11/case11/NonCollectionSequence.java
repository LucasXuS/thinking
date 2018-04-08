package chapter11.case11;

import chapter14.case06.Pet;
import chapter14.caseY.Pets;

import java.util.Iterator;

/**
 * 直接在类中添加迭代器，不继承任何容器类和接口。
 */
public class NonCollectionSequence {
    private Pet[] pets = Pets.createArray(8);

    public Iterator<Pet> iterator(){
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args){
        NonCollectionSequence c = new NonCollectionSequence();
        InterfaceVsIterator.display(c.iterator());
    }
}
