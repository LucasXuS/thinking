package chapter11.case11;

import chapter14.case06.Pet;
import chapter14.caseY.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * AbstractCollection是一个实现了Collection部分接口的抽象类。
 * 有时候，我们希望把容器之间的联系放在迭代器而不是底层接口上(因为implements Collection 有太多函数需要重写，效率较低)
 * Java给了我们AbstractCollection，能够通过较少的代码实现一个Collection的派生类。
 * <p>
 * 可见，继承AbstractCollection特点有两个：
 * 1 减少代码量，可以少重写很多函数
 * 2 引导上层程序员把联系放在Iterator而不是Collection上。
 */
public class CollectionSequence extends AbstractCollection<Pet> {

    private Pet[] pets = Pets.createArray(8);

    @Override
    public Iterator<Pet> iterator() {
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

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args){
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
