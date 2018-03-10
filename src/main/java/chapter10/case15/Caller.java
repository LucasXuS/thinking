package chapter10.case15;

/**
 * Created by lenovo on 2018/3/9.
 */
public class Caller {
    private Incrementable callbackReference;

    Caller(Incrementable incrementable) {
        callbackReference = incrementable;
    }

    void go() {
        callbackReference.increment();
    }
}


