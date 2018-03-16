package chapter12.case08;

/**
 * 异常丢失
 */
public class LostMessage {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            }finally {
                lm.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        /*
        *
        * 因为运行是先运行内层，再运行外层。
        * 所以，f()产生异常以后，先运行finally，finally又再次抛出错误
        * 在外层就只能捕获到第二次抛出的异常了。
        *
        * 总结：finally 无论如何都要运行的机制，
        * 在finally本身也要抛出异常的情况下，有可能会将抛出的异常覆盖掉，
        * 导致信息的丢失。
        * **/


        /*
        * 结合运行时异常的定义，运行时异常不会强制程序编写者catch错误，
        * 这就导致了运行时异常更容易被忽略，只需要在finally做好隐藏即可
        * **/


        try{
            throw new RuntimeException();
        }finally {
            return;
        }


    }
}
