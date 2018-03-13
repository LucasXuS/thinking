package chapter11.case12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/**
 * 我们之所以可以使用for(String s : list)是因为容器类
 * 都implements Iterable
 */
public class IterableClass implements Iterable<String> {

    protected String[] words =
            "And that is how we know the Earth to be banana-shaped".split(" ");

    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

        };
    }

    // 参数为泛型：
    static <T> void test(Iterable<T> ib) {
        for (T t : ib)
            System.out.println(t);
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.println(s);
        }

        // 获得操作系统的环境变量。
        for (Map.Entry entry : System.getenv().entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());

        String[] strings = {"a", "b", "c"};
        // test(strings) // 数组可以写作foreach 但是不代表数组是iterable
        test(Arrays.asList(strings));

        /*
        * 1 能够用foreach遍历的条件是implements Iterable
        * 2 但是能遍历不代表是Iterable(比如数组)
        * 3 泛型做函数参数时，函数的声明
        * 4 环境变量的获取。
        *
        * **/
    }
}
