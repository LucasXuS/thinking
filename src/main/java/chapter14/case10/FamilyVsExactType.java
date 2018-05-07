package chapter14.case10;

import static chapter06.case01.Print.print;
/*
* instanceof  比较的是 实例 和 类，当实例是右边类或者右边类的派生类的实例时返回真
* isInstance 比较的是 类对象 和 实例， 当实例是类对象或类对象派生类的类对象的实例时返回真
* equals 比较的是两个类对象，必须保证严格相等才返回真
* == 比较的是两个类对象，必须保证严格相等才返回真
*
* */
public class FamilyVsExactType {

    public static void test(Object x) {
        print("Testing x of type " + x.getClass());
        print("x instanceof Base " + (x instanceof Base));
        print("x instanceof Derived " + (x instanceof Derived));
        print("Base.class.isInstance(x) " + Base.class.isInstance(x));
        print("Derived.class.isInstance(x) " + Derived.class.isInstance(x));
        print("x.getClass().equals(Base.class) " + x.getClass().equals(Base.class));
        print("x.getClass().equals(Derived.class) " + x.getClass().equals(Derived.class));
        print("x.getClass() == Base.class " + (x.getClass() == Base.class));
        print("x.getClass() == Derived.class " + (x.getClass() == Derived.class));
    }

    public static void main(String[] args) {
        test(new Derived());
        test(new Base());
    }
}
