package chapter18.caseX;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

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
                while ((s = in.readLine()) != null) {
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

    public static void write(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile()
            );
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public TextFile(String fileName, String splitter) {
        super(Arrays.asList(read(fileName).split(splitter)));
        if (get(0).equals(""))
            remove(0);
    }

    public TextFile(String fileName){
        this(fileName, "\n");
    }

    public void write(String fileName){
        try{
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile()
            );
            try{
                this.forEach(out::println);
            }finally {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        String file = read("TextFile.java");
        write("text.txt", file);
        TextFile textFile = new TextFile("text.txt");
        textFile.write("test2.txt");
        TreeSet<String> words = new TreeSet<>(new TextFile("TextFile.java", "\\W+"));
        System.out.println(words.headSet("a"));
    }
}
