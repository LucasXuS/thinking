package chapter09.case03;

import java.util.Arrays;

/**
 * Created by xusong on 2018/3/4.
 */
public class Splitter extends StringProcessor {

    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));

    }
}
