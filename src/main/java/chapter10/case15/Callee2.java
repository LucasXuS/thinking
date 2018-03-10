package chapter10.case15;

/**
 * 内部类方式
 */
public class Callee2 extends MyIncrement {
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable {

        public void increment() {
            // 外围类对象
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference() {

        /*
        * Closure 类 类似于指针，我们可以通过它去访问和修改Callee2
        * 在这里我们发现两个特性：
        * Closure 依靠外围类对象去操纵Callee2
        * 我们可以可控地去控制Closure的功能，不像指针，可以让客户端
        * 程序员为所欲为。因此，这个思路是类似于指针，但是比指针安全
        * 得多的策略。
        * **/
        // 这是一个操纵Callee2的钩子
        return new Closure();
    }
}
