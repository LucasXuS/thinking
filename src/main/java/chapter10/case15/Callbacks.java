package chapter10.case15;

/**
 * 闭包和回调
 * 通过内部类提供闭包功能
 */
public class Callbacks {

    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
        /*
        * output:
        * Other operation
        * 1               //MyIncrement.f(c2)
        * 1               //caller1.go()
        * 2               //caller1.go()
        * Other operation
        * 2               //caller2.go()
        * Other operation
        * 3               //caller2.go()
        * **/
    }
}
