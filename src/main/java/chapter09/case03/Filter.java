package chapter09.case03;

/**
 * Created by xusong on 2018/3/4.
 */
public class Filter {

    public String name(){
        return getClass().getSimpleName();
    }

    public WaveForm process(WaveForm input){
        return input;
    }
}
