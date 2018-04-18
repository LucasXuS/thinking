package chapter11.case08;

import chapter18.caseX.TextFile;
import chapter06.case01.Print;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lenovo on 2018/3/13.
 */
public class UniqueWordsAlphabetic {

    public static void main(String[] args){
        // 按照字母顺序排序 String.CASE_INSENSITIVE_ORDER 本质上是一个Comparator<String>
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        // TextFile 是ArrayList<String>的派生类，所以可以作为初始化的元素
        words.addAll(new TextFile("SetOfInteger.java", "\\W+"));
        Print.print(words);
    }
}
