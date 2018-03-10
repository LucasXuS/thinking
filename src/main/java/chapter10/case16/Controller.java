package chapter10.case16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/3/9.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event e) {
        eventList.add(e);
    }

    public void run(){
        while (eventList.size() > 0){
            // 为了能够动态操作eventList，只好创建一个新的列表。
            new ArrayList<>(eventList).stream().filter(e -> e.ready()).forEach(e -> {
                System.out.println(e);
                e.action();
                eventList.remove(e);
            });
        }
    }
}
