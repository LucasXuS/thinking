package chapter10.case03;

/**
 * 显示调用外部类引用（所调用的外部类引用的特别之处，在于
 * 这是一个和当前内部类引用有联系的外部类引用）
 *
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            // 外部类引用
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        System.out.println(dt);
        System.out.println(dti.outer());
        /*
        * output:
        * chapter10.case03.DotThis@14ae5a5
        * chapter10.case03.DotThis@14ae5a5
        *
        * **/

        /*
        * 由输出可见，是同一个对象。
        *
        * **/
    }
}
