package chapter09.case03;

/**
 * Created by lenovo on 2018/3/5.
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }

    @Override
    WaveForm process(WaveForm input) {
        return input;
    }
}
