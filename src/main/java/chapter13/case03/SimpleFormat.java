package chapter13.case03;

/**
 * 格式化输出
 */
public class SimpleFormat {

    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;
        System.out.println("Row 1: [" + x + " " + y + "]");
        // 格式化输出
        // 以下两个函数是等价的。
        System.out.format("Row 1: [%d %f]\n", x, y);
        System.out.printf("Row 1: [%d %f]\n", x, y);
    }
}
