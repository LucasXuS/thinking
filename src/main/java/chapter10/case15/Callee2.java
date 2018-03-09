package chapter10.case15;

/**
 * Created by lenovo on 2018/3/9.
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
        return new Closure();
    }
}
