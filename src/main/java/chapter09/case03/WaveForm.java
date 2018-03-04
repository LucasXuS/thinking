package chapter09.case03;

/**
 * Created by xusong on 2018/3/4.
 */
public class WaveForm {
    // 这个是chapter08.case09的策略，此处不深入讨论
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString(){
        return "Waveform " + id;
    }


}
