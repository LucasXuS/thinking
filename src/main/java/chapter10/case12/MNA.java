package chapter10.case12;

/**
 * 多层内部类访问外围类元素
 */
public class MNA {
    private void f(){}
    class A{
        private void g(){}
        public class B{
            void h(){
                // 可以访问任意深度的外围类元素
                g();
                f();
            }
        }
    }
}
