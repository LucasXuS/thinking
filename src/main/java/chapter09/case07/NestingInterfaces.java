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

    }
}
