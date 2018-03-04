package chapter08.case12;

/**
 * 下溯造型
 * <p>
 * 我们在上溯造型的过程中会损失原有的类型信息（三角形——>几何图形），因此我们也有下溯造型
 * <p>
 * 但是下溯造型会产生错误，未必永远是正确的。（如：三角形——>几何图形——>圆）于是在每次下溯造型时都要进行检查
 * <p>
 * 检查的方式叫做RTTI (Runtime type information)运行时类型识别。
 */
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {new Useful(), new MoreUseful()};

        // 下溯造型错误，丢出ClassCastException
        // ((MoreUseful)x[0]).f();


        // 正确运行
        ((MoreUseful)x[1]).f();

    }
}
