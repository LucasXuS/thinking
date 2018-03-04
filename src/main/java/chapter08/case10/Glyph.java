package chapter08.case10;

import static util.Print.print;

/**
 * Created by xusong on 2018/3/3.
 */
public class Glyph {

    void draw(){
        print("Glyph.draw()");
    }

    Glyph(){
        print("Glyph() before draw()");

        // 动态绑定是由派生类——>基类运行。如果是派生类初始化，会调用最外层派生类的draw()函数
        // 应该避免这样做，会导致灾难，好的程序会尽量避免在构造器中调用函数（也许会被覆盖），
        // 或者直接调用private函数（永远不会被覆盖）
        draw();
        print("Glyph() after draw()");
    }

}
