package chapter09.case06;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * 适配器模式，为了能够让现有类RandomDoubles能够初始化Scanner
 */
public class RandomDoublesAdapter extends RandomDoubles implements Readable{

    private int count;

    public RandomDoublesAdapter(int count){
        this.count = count;
    }

    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0)
            return -1;
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args){
        Scanner s = new Scanner(new RandomDoublesAdapter(5));
        while (s.hasNextDouble()) {
            // 似乎Scanner 可以识别double
            System.out.print(s.nextDouble() + " ");
        }
    }
}
