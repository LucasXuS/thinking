package chapter08.case07;
import static util.Print.print;
/**
 * 构造器和多态
 * “上溯造型”给了我们一个解释为何派生类构造之前要确保基类运行构造函数。
 * 由于在上溯造型的时候，我们不仅需要了解该类型的全部，也要同时了解其基类
 * 的全部。
 */
public class Sandwich extends PortableLunch {
    Sandwich(){
        print("Sandwich()");
    }
}
