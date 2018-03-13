package chapter09.case11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by lenovo on 2018/3/13.
 */
public class MyQueue {

    private List<Integer> list;
    private MyComparator comparator;

    private void sort(){

        Integer[] ints = list.toArray(new Integer[0]);
        // 实现排序算法，这里用插入排序
        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (comparator.compare(ints[j - 1], ints[j]) > 0) {
                    int temp = ints[j];
                    ints[j] = ints[j - 1];
                    ints[j - 1] = temp;
                }
            }
        }
        list.clear();
        Collections.addAll(this.list, ints);
    }

    MyQueue(List<Integer> list, MyComparator comparator) {

        // 现在参数中的list 是一个基于数组的list，不支持clear()等操作。
        this.list = new ArrayList<>();
        this.list.addAll(list);
        this.comparator = comparator;
        sort();
    }

    public void offer(int element){
        list.add(element);
        sort();
    }

    public Integer peek(){
        if(list == null || list.size() == 0)
            return null;
        return list.get(0);
    }

    public Integer remove(){
        if(list == null || list.size() == 0)
            return null;
        Integer ret = list.get(0);
        list.remove(0);
        return ret;
    }

    public void addAll(List<Integer> list){
        this.list.addAll(list);
        sort();
    }
}
