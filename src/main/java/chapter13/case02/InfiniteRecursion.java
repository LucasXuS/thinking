package chapter13.case02;

/**
 * Created by xusong on 2018/3/18.
 */
public class InfiniteRecursion {

    // 重写toString()理论上会陷入无限循环。

    @Override
    public String toString() {

        // return " InfiniteRecursion address: " + this + "\n";// 由于String + Object会自动变成 String + Object.toString()。这样，toString()会陷入无限递归的境地。
        return " InfiniteRecursion address: " + super.toString() + "\n"; // 这样才能正确输出对象地址。因为是Object.toString()
    }

    public static void main(String[] args) {
        InfiniteRecursion infiniteRecursion = new InfiniteRecursion();
        System.out.println(infiniteRecursion);
    }
}
