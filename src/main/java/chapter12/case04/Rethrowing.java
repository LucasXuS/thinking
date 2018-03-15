package chapter12.case04;

/**
 * Created by lenovo on 2018/3/14.
 */
public class Rethrowing {
    public static void f() throws Exception {
        System.out.println("originating the exception in f()");
        throw new Exception("thrown from f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g().e.printStackTrace()");
            // 1 追踪错误： f()->g()->main()
            // 2 追踪错误： f()->g()->h()->main()
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            g();
        } catch (Exception e) {
            System.out.println("Inside h().e.printStackTrace()");
            // 追踪错误： f()->g()->h()->main()
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }


    public static void main(String[] args){
        try {
            g();
        } catch (Exception e) {
            System.out.println("main().e.printStackTrace()");
            // 追踪错误： f()->g()->main()
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (Exception e) {
            System.out.println("main()C.e.printStackTrace()");
            // 追踪错误： h()->main()
            e.printStackTrace(System.out);
        }

    }

    /*
    * 重新抛出异常不会让程序调用栈发生任何改变
    * 但是,使用e.fillInStackTrace()可以重置调用栈，把当前位置当做
    * 调用最内层。
    *
    * 这样会导致信息丢失，剩下的是与新的抛出点有关的信息。
    *
    * **/
}
