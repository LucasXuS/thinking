package chapter09.case03;

/**
 * Created by lenovo on 2018/3/5.
 */
public class FilterProcessor {
    public static void main(String[] args){
        WaveForm waveForm = new WaveForm();
        Apply.process(new FilterAdapter(new LowPass(1.0)), waveForm);
        Apply.process(new FilterAdapter(new HighPass(2.0)), waveForm);
        Apply.process(new FilterAdapter(new BandPass(1.0, 2.0)), waveForm);
    }
}
