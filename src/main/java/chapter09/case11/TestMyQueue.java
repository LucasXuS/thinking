package chapter09.case11;

import java.util.Arrays;
import java.util.List;

/**
 * 本例是编者自己创建的一个例子
 *
 * 结合内部类，接口，以及容器等一系列知识，可以明白PriorityQueue是可以自定义排序的
 * 排序的关键在于接口Comparator。
 *
 * 在学习容器的过程中，可以看到，Comparator有两个来源，一个来源是自己实现，一个来源来自于默认的
 *
 * 因此，为了模仿这个特性，一个例子是直接由匿名内部类（后改成lambda表达式）的方式呈现
 * 一个则动用了默认的reverse()
 *
 */
public class TestMyQueue implements MyComparator{

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(12,34,53,12,43,23,55,78,23,45,67,22);

        MyQueue queue = new MyQueue(list, (o1, o2) -> o1 - o2);

        while (queue.peek() != null){
            System.out.print(queue.remove() + " ");
        }
        System.out.println();


        TestMyQueue testMyQueue = new TestMyQueue();

        MyQueue queue2 = new MyQueue(list, testMyQueue.reverse());
        while (queue2.peek() != null){
            System.out.print(queue2.remove() + " ");
        }

        /*
        * 1 接口中仍然可以实现函数体，只是要添加关键词default
        * 2 接口中默认函数的函数的调用依赖于implements这个接口的类。
        * 3 一个疑问，刚开始为了更完善，直接写的Comparator<T>,但是在类型未知的时候，比较算法不知如何编写。
        *
        * **/
    }

    @Override
    public int compare(int o1, int o2) {
        return 0;
    }
}
