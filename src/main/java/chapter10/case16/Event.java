package chapter10.case16;

/**
 * Created by lenovo on 2018/3/9.
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
    }

    public void start() {
        // System.nanoTime() 返回当前时间的毫秒值
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() > eventTime;
    }

    public abstract void action();
}
