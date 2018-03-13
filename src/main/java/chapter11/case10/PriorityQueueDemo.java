package chapter11.case10;

import util.Print;

import java.util.*;

/**
 * 队列是个典型的先进先出的容器
 * 在并发编程中，他们可以安全地把对象从一个任务传输给另外一个任务
 * <p>
 * 它的功能是LinkedList的子集。
 * <p>
 * <p>
 * 先进先出是最典型的队列规则。
 * 但是我们可以通过实现Comparator接口指定自己的优先级规则
 */
public class PriorityQueueDemo implements Comparator<Worker> {


    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            // addLast()功能一样
            priorityQueue.offer(random.nextInt(i + 10));
        }
        printQ(priorityQueue);
        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 12, 3, 9, 14, 18, 21, 24, 25);

        // 向Priority的构造函数中传递容器尺寸和Comparator
        priorityQueue = new PriorityQueue<>(
                // 从大到小排序
                ints.size(), Collections.reverseOrder()
        );
        priorityQueue.addAll(ints);
        printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ
                = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        // 可以依靠stringPQ的方法为已有的列表复制并且排序
        printQ(stringPQ);

        // 自定义排序
        // 我们注意到参数有一个Comparator 接口，我们可以重写这个接口从而达到自定义排序队列的目的
        // 接口我们采取两种实现方式，一个是直接实现，一个是匿名内部类。

        List<Worker> workerList = Arrays.asList(
                new Worker("Tom", 3500.00, 20), new Worker("Gary", 4800.00, 70)
                , new Worker("Jerry", 13500.00, 40), new Worker("Harry", 7500.00, 45)
                , new Worker("Ron", 1500.00, 12), new Worker("Edison", 93500.00, 1)
        );
        PriorityQueueDemo demo = new PriorityQueueDemo();
        PriorityQueue<Worker> workers = new PriorityQueue<>(
                workerList.size(), demo
        );
        workers.addAll(workerList);

        while (workers.peek() != null) {
            Worker worker = workers.remove();
            Print.print(worker.getName() + "'s age is: " + worker.getAge());
        }

        System.out.println("匿名内部类，按照收入排序");
        // 通过匿名内部类
        PriorityQueue<Worker> workers2 = new PriorityQueue<>(
                workerList.size(), new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }
        );
        workers2.addAll(workerList);

        while (workers2.peek() != null) {
            Worker worker = workers2.remove();
            Print.print(worker.getName() + "'s salary is: " + worker.getSalary());
        }



    }

    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getAge() - o2.getAge();
    }
}
