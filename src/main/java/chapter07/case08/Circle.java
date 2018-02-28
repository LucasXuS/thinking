package chapter07.case08;

import static util.Print.print;

/**
 * Created by lenovo on 2018/2/27.
 */
public class Circle extends Shape {
    Circle(int i) {
        super(i);
        print("Drawing Circle");
    }

    @Override
    void dispose() {
        print("Erasing Circle");
        super.dispose();
    }
}
