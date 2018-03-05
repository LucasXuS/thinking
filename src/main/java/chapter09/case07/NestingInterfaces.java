package chapter09.case07;

/**
 * 嵌套接口
 */
public class NestingInterfaces {
    public class BImp implements A.B {
        public void f() {
        }
    }

    class CImp implements A.C {
        public void f() {
        }
    }

    // 私有接口是不可implements的
//    class DImp implements A.D {
//    }

    class EImp implements E{
        public void g() {
        }
    }

    class EGImp implements E.G{
        public void f() {
        }
    }

    class EImp2 implements E{
        public void g(){}
        class EG implements E.G{
            public void f() {
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        // 无法调用A.D
        // A.D ad = a.getD();

        // 只能返回A.D
        // A.DImp2 di2 = a.getD();

        // 可以下溯造型
        A.DImp2 di2 = (A.DImp2)a.getD();

        // 由于无法访问A.D,所以也调不了A.D的函数
        // a.getD().f();

        // 完成值传递却可以
        A a2 = new A();
        a2.receiveD(a.getD());

        // 可以下溯造型
        ((A.DImp2)a2.getD()).f();

        /*
        *
        * private的嵌套接口的优势：
        * 它可以强制该接口中的方法定义不要添加任何类型信息（不许上溯造型）
        *
        * a.getD() 返回类型是不可使用的，函数本身可以使用，所以只能用作变量传递

        * **/

    }
}
