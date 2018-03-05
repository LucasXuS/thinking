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
        *
        *
        * **/
    }
}
