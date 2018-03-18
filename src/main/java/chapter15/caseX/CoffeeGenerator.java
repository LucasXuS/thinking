package chapter15.caseX;

import java.util.Iterator;

/**
 * Created by xusong on 2018/3/18.
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    @Override
    public Coffee next() {
        return null;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return null;
    }

    class CoffeeIterator implements Iterable<Coffee> {

        @Override
        public Iterator<Coffee> iterator() {
            return null;
        }
    }
}
