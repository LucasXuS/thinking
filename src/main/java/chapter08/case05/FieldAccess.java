package chapter08.case05;

import static util.Print.print;

/**
 * 类里面的变量（属性）不具有多态性。因为只有函数才会进行后期绑定。
 */
public class FieldAccess {

    public static void main(String[] args) {
        Super sup = new Sub();
        print("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        print("sub.field = " + sub.field + ", sub.getField() = " + sub.getField()
                + ", sub.getSuperField() = " + sub.getSuperField());
        /*
        * output:
        * sup.field = 0, sup.getField() = 1
        * sub.field = 1, sub.getField() = 1, sub.getSuperField() = 0
        * **/

    }
}
