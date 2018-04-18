package chapter10.case19;

import static chapter06.case01.Print.print;
import static chapter06.case01.Print.printnb;

/**
 * 局部内部类
 */
public class LocalInnerClass {
    private int count = 0;


    // 局部内部类
    Counter getCounter(final String name) {

        // 代码块中的内部类不再是外围类的一部分。
        // 所以，局部内部类不能有说明符
        class LocalCounter implements Counter {

            public LocalCounter() {
                print("LocalCounter()");
            }

            @Override
            public int next() {
                printnb(name);
                return count++;
            }
        }

        return new LocalCounter();

    }

    // 匿名内部类
    Counter getCounter2(final String name) {

        // 匿名内部类
        return new Counter() {

            // 匿名内部类因为没有名字只好以实例初始化的方式创造构造函数，详见chapter10.case07
            {
                print("Anonymous Counter()");
            }

            @Override
            public int next() {
                printnb(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        Counter
                c1 = localInnerClass.getCounter("Local inner "),
                c2 = localInnerClass.getCounter2("Anonymous inner ");
        for (int i = 0; i < 5; i++) {
            print(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            print(c2.next());
        }

        // 我们使用局部内部类的唯一理由，是我们需要一个已经命名的构造器，或者是重载构造器。

    }


}
