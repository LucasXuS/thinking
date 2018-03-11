package chapter10.case19;

import static util.Print.print;

/**
 * 局部内部类
 */
public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {

        // 代码块中的内部类不再是外围类的一部分。
        class LocalCounter implements Counter {

            public LocalCounter() {
                print("LocalCounter()");
            }

            @Override
            public int next() {
                print(name);
                return count++;
            }
        }

        return new LocalCounter();

    }

    Counter getCounter2(final String name) {

        // 匿名内部类
        return new Counter() {

            // 匿名内部类因为没有名字只好以实例初始化的方式创造构造函数，详见chapter10.case07
            {
                print("Anonymous Counter()");
            }

            @Override
            public int next() {
                print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {

    }


}
