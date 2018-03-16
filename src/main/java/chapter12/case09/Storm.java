package chapter12.case09;

/**
 * Created by lenovo on 2018/3/16.
 */
interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}
