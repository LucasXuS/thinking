package chapter12.case13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 主函数抛异常，直接传递给控制台。
 */
public class MainException {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("haha.java");
        fileInputStream.close();
    }
}
