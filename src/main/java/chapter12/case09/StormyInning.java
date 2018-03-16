package chapter12.case09;

/**
 * 在基类或者接口中的方法有
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
