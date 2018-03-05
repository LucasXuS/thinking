package chapter09.case03;


/**
 * Created by lenovo on 2018/3/5.
 */
public abstract class StringProcessor implements Processor {

    public String name(){
        return getClass().getSimpleName();
    }

    // 协变
    public abstract String process(Object input);

    public static String s =
            "If she weighs the same as a duck, she's made of wood";

    public static void main(String[] args){
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
        /*
        * 首先注意我们修改代码时的身份：我们是底层开发者，我们无权动上层开发者的代码（Filter系列开发者），我们要做的，只
        * 能是优化结构，接纳新的代码，让代码的复用性更强。
        *
        * 为了能够不修改Upcase等处理器（因为真正实战时，这样的类可能很多），同时为了适配Filter我们将Processor改成了接口，
        * 因此我们在此处添加了一个抽象类，这个抽象类有两方面作用：
        * 1 为了保险起见，我们干脆将process做成了协变，要求返回String
        * 2 实现name()因为这个是不可变的。这是我们Processor类改接口的补偿
        *
        *
        * **/
    }
}
