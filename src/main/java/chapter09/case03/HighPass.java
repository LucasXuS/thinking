package chapter09.case03;

/**
 * Created by lenovo on 2018/3/5.
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    WaveForm process(WaveForm input) {
        return input;
    }
}
