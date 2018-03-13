package chapter11.case08;

import chapter18.caseX.TextFile;
import util.Print;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lenovo on 2018/3/13.
 */
public class UniqueWordsAlphabetic {

    public static void main(String[] args){
        // 按照字母顺序排序
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("SetOfInteger.java", "\\W+"));
        Print.print(words);
    }
}
