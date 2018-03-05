package chapter09.case04;
import static util.Print.print;

/**
 * Created by xusong on 2018/3/4.
 */
public class Downcase extends StringProcessor {

    @Override
    public String process(Object input){
        return ((String)input).toLowerCase();
    }

}
