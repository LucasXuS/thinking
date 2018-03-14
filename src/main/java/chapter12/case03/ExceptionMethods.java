package chapter12.case03;

/**
 * 在仅仅catch Exception()的情况下获取更多异常信息
 */
public class ExceptionMethods {

    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            // 信息
            System.out.println("getMessage():" + e.getMessage());
            System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());
            // e的类型+信息
            System.out.println("toString():" + e);
            // e的类型+信息+函数调用栈
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
