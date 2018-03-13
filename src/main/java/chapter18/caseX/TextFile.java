package chapter18.caseX;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by xusong on 2018/3/13.
 */
public class TextFile extends ArrayList<String> {
    // 把文件里的内容读成字符串，且保留换行符
    public static String read(String fileName) {

        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(new File(fileName).getAbsoluteFile())
            );
            try {
                String s;
                while ((s = in.readLine()) != null){
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }


}
