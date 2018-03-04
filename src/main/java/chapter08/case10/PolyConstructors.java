package chapter08.case10;

/**
 * 在构造器中使用多态方法。
 */
public class PolyConstructors {

    public static void main(String[] args){
        new RoundGlyph(5);

        /*
        * output:
        *
        * Glyph() before draw()
        * RoundGlyph.draw(), radius = 0
        * Glyph() after draw()
        * RoundGlyph.RoundGlyph(), radius = 5
        * */

        /*
        *
        * 动态绑定的过程与构造函数调用的过程方向相反
        * 构造函数是从基类到派生类，而动态绑定却是由
        * 派生类到基类的。
        *
        * 因此极有可能出现派生类尚未初始化就开始调用派生类函数的情况。
        * 本例中，基类构造函数运行时，优先绑定派生类的draw()函数。但
        * 是，派生类构造函数晚于基类构造函数运行，所以此时RoundGlyph
        * 还来不及初始化，RoundGlyph中的对象只能全部取系统默认值。其中
        * radius只好取int的默认值0。这样很容易造成灾难。
        *
        * **/
    }
}
