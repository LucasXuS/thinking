package chapter12.case10;

/**
 * 异常与对象清理。
 */
public class Cleanup {

    public static void main(String[] args) {

        /*
        * 如果构造失败，将进入外部的catch子句，而dispose()方法不会被调用
        * 如果构造成功，对象才会被清理。在这种结构中，finally在构造失败时
        * 不会被执行，成功时才会被执行。
        *
        * 我们之所以可以这样写，是因为InputFile的构造在出问题的时候已经
        * 释放了BufferedReader，是一个封闭的遇到问题自我销毁系统，所以最
        * 外层catch已经不需要销毁程序了。
        * **/
        try {
            InputFile in = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    System.out.println(s);
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
