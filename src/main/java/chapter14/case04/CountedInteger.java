package chapter14.case04;

/**
 * Created by lenovo on 2018/4/8.
 */
public class CountedInteger {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}
