package chapter08.case02;

/**
 * 绑定——多态的本质
 * 将一个“方法调用动作” 和 一个“方法主体”联系起来的动作叫做绑定。
 * 前期绑定：程序执行前绑定（C语言只有前期绑定 ）
 * 后期绑定：程序运行时，通过获取对象类型，动态的进行绑定。
 * <p>
 * JAVA中，除了static和final方法之外，都是后期绑定的。
 */
public class Shapes {
    private static RandomShapeGenerator generator
            = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++) {
            // 在此处，上溯造型
            shapes[i] = generator.next();
        }

        for (Shape shape : shapes) {
            shape.draw();
        }

        /*
        *
        * output:
        * Triangle.draw()
        * Triangle.draw()
        * Square.draw()
        * Triangle.draw()
        * Square.draw()
        * Triangle.draw()
        * Square.draw()
        * Triangle.draw()
        * Circle.draw()
        * **/
    }
}
