package chapter12.case04;

/**
 * Rethrowing.java举例的是调用栈信息的丢失，这里展示
 * 重新抛出新exception时可以让原异常的信息都一并丢失。
 */
public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("originating the exception in f()");
        throw new OneException("thrown from f()");
    }

    public static void main(String[] args){
        try {
            try {
                f();
            }catch (OneException e){
                System.out.println("Caught in inner try, e.printStackTrace()");
                e.printStackTrace(System.out);
                // 在catch中处理元错误，抛出新错误，两个异常之间没有联系。
                throw new TwoException("from inner try");
            }
        }catch (TwoException e){
            System.out.println("Caught in outer try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }

}
