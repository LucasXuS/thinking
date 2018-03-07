package chapter09.case06;

import java.util.Random;

/**
 * 另一位开发者添加的类，用于生成随机数，但是没有实现Readable接口
 * <p>
 * 如果我们要用此类来初始化Scanner，我们的立场，既不可以改变Scanner本身
 * 也不可以改变此类
 */
public class RandomDoubles {
    private static Random random = new Random(47);

    public double next() {
        return random.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }

}
