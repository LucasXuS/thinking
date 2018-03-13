package chapter11.case12;

import java.util.Arrays;

/**
 * 本例是基于继承基础库容器的遍历
 */
public class AdapterMethodIdiom {
    public static void main(String[] args){
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(
                Arrays.asList("To be or not to be".split(" "))
        );
        // 使用自带的iterable
        for(String s : ral){
            System.out.print( s + " ");
        }
        System.out.println();

        // 使用自建的iterable
        for(String s : ral.reversed()){
            System.out.print( s + " ");
        }
        System.out.println();
    }
}
