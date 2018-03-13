package chapter11.case12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by lenovo on 2018/3/13.
 */
public class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }

    public Iterable<T> reversed() {
        return () -> new Iterator<T>() {
            // 因为反向迭代，所以这样写
            int current = size() - 1;

            @Override
            public boolean hasNext() {
                return current > -1;
            }

            @Override
            public T next() {
                return get(current--);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

        };
    }
}
