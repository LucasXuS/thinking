package chapter09.case07;

/**
 * Created by lenovo on 2018/3/5.
 */
public class A {
    interface B {
        void f();
    }

    public class BImp implements B {
        public void f() {
        }
    }

    public class BImp2 implements B {
        public void f() {

        }
    }

    interface C {
        void f();
    }

    public class CImp implements C {
        public void f() {
        }
    }

    public class CImp2 implements C {
        public void f() {

        }
    }

    interface D {
        void f();
    }

    public class DImp implements D {
        public void f() {
        }
    }

    public class DImp2 implements D {
        public void f() {
        }
    }

    public D getD() {
        return new DImp2();
    }

    private D dRef;

    public void receiveD(D d) {
        this.dRef = d;
        d.f();
    }


}

