package chapter12.case07;

/**
 * 双层finally
 */
public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Entering first try block");
        try {
            System.out.println("Entering second try block");
            try {
                throw new ThreeException();
            } finally {
                System.out.println("finally in 2nd try block");
            }
        } catch (ThreeException e) {
            System.out.println("Caught ThreeException in 1st try block");
        } finally {
            System.out.println("finally in 1st try block");
        }
        /*
        * 结论：先运行内层，后运行外层
        *
        * 另外：当涉及break 和 continue的时候，finally也会得到执行。
        * **/
    }
}
