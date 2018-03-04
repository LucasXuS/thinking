package chapter09.case03;

/**
 * Created by xusong on 2018/3/4.
 */
public class BandPass extends Filter {


    double lowCutoff, highCutoff;

    BandPass(double lowCutoff, double highCutoff){
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public WaveForm process(WaveForm input){
        return input;
    }
}
