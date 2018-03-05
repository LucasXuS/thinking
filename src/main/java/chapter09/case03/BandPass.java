package chapter09.case03;

/**
 * Created by lenovo on 2018/3/5.
 */
public class BandPass extends Filter {

    double highCutoff, lowCutoff;

    public BandPass(double highCutoff, double lowCutoff) {
        this.highCutoff = highCutoff;
        this.lowCutoff = lowCutoff;
    }

    @Override
    WaveForm process(WaveForm input) {
        return input;
    }
}
