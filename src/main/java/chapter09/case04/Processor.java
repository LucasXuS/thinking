package chapter09.case04;
import static util.Print.print;
/**
 * Created by xusong on 2018/3/4.
 */
public interface Processor {
    String name();

    Object process(Object input);
}
