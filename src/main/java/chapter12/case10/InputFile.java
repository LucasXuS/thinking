package chapter12.case10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by lenovo on 2018/3/16.
 */
public class InputFile {
    private BufferedReader in;

    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            // 这时还不需要关闭in ,因为文件还没被打开
            System.out.println("Could not open " + fname);
            throw e;
        } catch (Exception e) {
            // 这里要捕获的更多是RuntimeException，因为不会显式表现出来。
            try {
                in.close();
            } catch (IOException e1) {
                System.out.println("in.close() unsuccessful");
            }
            throw e;
        } finally {
            // 不能再这里清理in，因为finally 不管成功与否都会用，
            // 这样，程序使用getLine()就会报错，我们只希望出异常的时候关闭in
        }

    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch (IOException e) {
            throw new RuntimeException("in.close() failed");
        }
    }

}
