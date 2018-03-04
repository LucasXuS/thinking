package chapter09.case03;

/**
 * Created by xusong on 2018/3/4.
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public WaveForm process(WaveForm input){
        return input;
    }
}
