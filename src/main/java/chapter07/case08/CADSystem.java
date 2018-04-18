package chapter07.case08;

import static chapter06.case01.Print.print;

/**
 * 在继承过程中对象的清除
 */
public class CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * j);
        }
        c = new Circle(1);
        t = new Triangle(1);
        print("Combined constructor");
    }

    @Override
    public void dispose() {
        print("CADSystem.dispose()");
        c.dispose();
        t.dispose();
        for (int i = lines.length - 1; i >= 0; i--) {
            lines[i].dispose();
        }
        // 释放基类子对象的方法
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        x.dispose();
        /**
         * output:
         * Shape constructor
         * Shape constructor
         * Drawing Line: 0, 0
         * Shape constructor
         * Drawing Line: 1, 1
         * Shape constructor
         * Drawing Line: 2, 4
         * Shape constructor
         * Drawing Circle
         * Shape constructor
         * Drawing Triangle
         * Combined constructor
         * CADSystem.dispose()
         * Erasing Circle
         * Shape dispose
         * Erasing Triangle
         * Shape dispose
         * Erasing Line: 2, 4
         * Shape dispose
         * Erasing Line: 1, 1
         * Shape dispose
         * Erasing Line: 0, 0
         * Shape dispose
         * Shape dispose
         *
         * */

        /**
         *
         * 1 如果不适用JVM自带的垃圾处理，清除基类子对象的方式，就是在基类写一个清理方法
         * 在派生类继承这个方法，然后用super.dispose()调用它。
         * 2 先清除本类的所有对象，再清除基类子对象。
         *
         * */

    }


}
