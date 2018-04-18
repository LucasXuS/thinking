package chapter08.case10;

import static chapter06.case01.Print.print;

/**
 * Created by xusong on 2018/3/3.
 */
public class RoundGlyph extends Glyph {

    private int radius = 1;

    RoundGlyph(int r){
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw(){
        print("RoundGlyph.draw(), radius = " + radius);
    }
}
