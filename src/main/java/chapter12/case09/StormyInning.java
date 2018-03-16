package chapter12.case09;

/**
 * Created by lenovo on 2018/3/16.
 */
public class StormyInning extends Inning implements Storm{
    public StormyInning() throws BaseballException {

    }

    @Override
    public void atBat() throws Strike, Foul {

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    @Override
    public void event(){}
}
