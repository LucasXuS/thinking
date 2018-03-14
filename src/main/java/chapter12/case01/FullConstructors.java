package chapter12.case01;

/**
 * 把异常信息写入System.err比写入System.out要好，因为
 * System.out 可能被重定向（也就是说我们通过System.out.println()
 * 等操作直接将输出写到具体文件而不是控制台）
 * 而System.err并不会随着System.out一起重定向
 * （因为System.out重定向以后有可能是程序运行成果，而我们并不希望
 * 连程序运行信息一并被写进去）
 * <p>
 * 我们可以通过写入System.err将错误发给标准错误流
 */
public class FullConstructors {

    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        // 我们甚至可以很“肤浅”地认为throw 的作用类似return
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args){
        try {
            f();
        }catch (MyException e){
            // 这个是通过写入System.out输出异常
            e.printStackTrace(System.out);
        }
        try {
            g();
        }catch (MyException e){
            // 这个是通过写入System.err输出异常
            // printStackTrace在无参的时候会默认调用printStackTrace(System.err)
            e.printStackTrace(System.err);
        }
    }

}
