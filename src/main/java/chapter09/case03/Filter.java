package chapter09.case03;

/**
 * Created by lenovo on 2018/3/5.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    WaveForm process(WaveForm input) {
        return input;
    }
}
