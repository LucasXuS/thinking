package chapter07.case16;

import static chapter06.case01.Print.print;

/**
 * 初始化顺序
 */
public class Beetle extends Insect {
    private int k = printInt("Beetle.k initialized");

    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static int x2 = printInt("static Beetle.x2 initialized");

    public static void main(String[] args){
        print("Beetle constructor");
        Beetle b = new Beetle();

        /*
        * output:
        * static Insect.x1 initialized
        * static Beetle.x2 initialized
        * Beetle constructor
        * i = 9, j = 0
        * Beetle.k initialized
        * k = 47
        * j = 39
        * **/

        /*
        * 加载与初始化流程：
        *
        * 在Beetle类中，运行静态函数。加载器首先回去找Beetle类的编译代码。
        * 对其加载的过程中，发现Beetle有一个基类，于是加载器继续加载，不管
        * 你是否打算产生一个基类对象，它都要发生。
        * 接下来就是基类的static 初始化，然后是派生类的静态变量初始化，以此类推
        * 至此，所有类都被加载完毕，开始创建对象。
        * 首先对象中所有的基本类型都被设置为默认值，对象应用被设置为null——这是
        * 将对象内存设置为0而产生的。
        *
        * 下面开始创建对象，调用构造函数。创建对象后，开始初始化实例变量，接着
        * 运行构造器其余的部分。
        *
        * **/

        /*
        *
        * 简而言之：流程为：基类静态变量初始化——>派生类静态变量初始化
        * ——>创建对象（此处调用基本构函）——>创建非静态基类对象
        * ——>创建非静态派生类对象——>基类构函——>派生类构函
        *
        * 1 构函被使用两次，一次是创建基本对象，一次是运行剩下的部分。
        * 2 静态函数运行时晚于类加载，所以在本例中，先创建静态变量，后运行主程序第一句。
        *
        * **/
    }
}
