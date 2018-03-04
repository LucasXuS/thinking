package chapter09.case03;

/**
 * Created by xusong on 2018/3/4.
 */
public class Upcase extends Processor {
    @Override
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}
