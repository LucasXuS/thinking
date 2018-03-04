package chapter09.case03;
import static util.Print.print;

/**
 * Created by xusong on 2018/3/4.
 */
public class Downcase extends Processor {

    @Override
    String process(Object input){
        return ((String)input).toLowerCase();
    }

}
