package chapter09.case04;

/**
 * Created by lenovo on 2018/3/5.
 */
public class WaveForm {
    // 计数，在chapter08.case09中有详述
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform" + id;
    }
}
