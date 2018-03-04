package chapter09.case03;
import static util.Print.print;
/**
 * Created by xusong on 2018/3/4.
 */
public class Processor {
    public String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input){
        return input;
    }
}
