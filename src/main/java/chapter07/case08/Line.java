package chapter07.case08;

import static util.Print.print;

/**
 * Created by lenovo on 2018/2/27.
 */
public class Line extends Shape {
    private int start, end;

    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        print("Drawing Line: " + start + ", " + end);
    }
    @Override
    void dispose() {
        print("Erasing Line: " + start + ", " + end);
        super.dispose();
    }
}
