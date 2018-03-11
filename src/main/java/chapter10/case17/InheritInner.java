package chapter10.case17;

/**
 * 继承内部类
 *
 * 内部类的产生一定来自于某个外围类，所以，
 * 内部类的子类同样依赖于这个外围类，因此，构造器强制要求参数为外围类，并且需要外围类初始化。
 */
public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
