package chapter09.case06;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * 适配接口
 * <p>
 * Scanner类的构造器的参数是接口Readable
 * <p>
 * interface Readable是专门为Scanner创建的。这种模式加强了Scanner的灵活性，即:
 * 我希望class Something用来初始化Scanner，我只要：
 * class Something implements Readable即可。这样，Scanner构造函数的参量不再
 * 被限制为某个特定类。通过这种方式，Scanner可以作用于更多的类型。
 */
public class RandomWords implements Readable {

    private static Random random = new Random(47);
    private static final char[] capitals
            = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private static final char[] lowers
            = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    private static final char[] vowels = "aeiou".toCharArray();

    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0)
            return -1;
        cb.append(capitals[random.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[random.nextInt(vowels.length)]);
            cb.append(lowers[random.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;// 加入字符长度
    }

    public static void main(String[] args){
        Scanner s = new Scanner(new RandomWords(5));
        while (s.hasNext()){
            System.out.println(s.next());
        }
        /*
        * output:
        * Yazeruyac
        * Fowenucor
        * Goeazimom
        * Raeuuacio
        * Nuoadesiw
        *
        * **/
    }
}
