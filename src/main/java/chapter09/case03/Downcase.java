package chapter09.case03;

/**
 * Created by xusong on 2018/3/4.
 */
public class Downcase extends StringProcessor {

    @Override
    public String process(Object input){
        return ((String)input).toLowerCase();
    }

}
