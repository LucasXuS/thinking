package chapter08.case11;

/**
 * Created by xusong on 2018/3/4.
 */
public class WheatMill extends Mill {

    @Override
    Wheat process() {
        return new Wheat();
    }
}
