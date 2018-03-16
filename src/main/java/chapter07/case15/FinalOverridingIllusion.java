package chapter07.case15;

/**
 * 使用final方法的原因有两个
 * 1 把方法锁定，防止任何类重写这个函数
 * 2 早期final函数会被当作内联函数。但是这个作用被逐渐舍弃。
 *
 * 所有的private方法被隐式指定为final函数。
 *
 *
 * final类：永远无法被继承
 */
public class FinalOverridingIllusion {

    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;// 上溯造型

        // 无法调用函数
        //op.f();
        //op.g();


        /*
        * 1 如果基类的某个函数是private，那么就代表这段代码是隐藏在类中的代码，
        * 如果派生类即使有同名函数，二者也没有任何关系。就像本例中，WithFinals
        * 和OverridingPrivate2中的f(),g()仅仅是同名，没有任何关系。
        *
        * **/


        // 覆盖
        OverridingPrivate3 op3 = new OverridingPrivate3();
        OverridingPrivate2 op2x = op3;
        op2x.f();
        op2x.g();


        /*
        * output:
        * OverridingPrivate2.f()
        * OverridingPrivate2.g()
        * OverridingPrivate3.f()
        * OverridingPrivate3.g()
        *
        * **/

        /*
        *
        * 上述覆盖的例子说明类覆盖的含义。op3在上溯造型后变成op2的引用，
        * 调用g(),f()后，运行的是op3的内容。
        *
        * 覆盖的内涵：
        * 基类存在函数f(),g()，派生类可以Override这些函数。
        * 众所周知，构造器的调用顺序是先运行最基类的构造函数，
        * 再依次运行派生类的构造函数，直到当前类为止，但是，
        * 调用函数是相反的，上溯造型后，不管是哪一层的派生类，
        * 甚至是最底层的基类，调用Override的顺序永远是从最外层
        * 开始调用。因此，在上溯造型后，再次调用这个函数永远是
        * 最外层的函数，给人的感觉就是被覆盖了。
        *
        * **/

    }


}
