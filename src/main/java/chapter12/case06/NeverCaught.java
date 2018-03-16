package chapter12.case06;

/**
 * 运行时异常：RuntimeException
 * 1 不用写异常说明
 * 2 自动被Java虚拟机抛出
 * 3 被称为：不受检查的异常，这种异常属于错误，将被自动捕获。
 * 4 但是真正写代码时，在代码里还是会主动抛出这样的异常
 * 5 如果不捕获，程序退出之前将调用异常的printStackTrace()
 */
public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g(){
        f();
    }

    public static void main(String[] args){
        g();
    }
}
