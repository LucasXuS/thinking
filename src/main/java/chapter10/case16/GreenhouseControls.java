package chapter10.case16;

/**
 * 这个类就是控制框架
 * <p>
 * 1 控制框架的完整实现是由一个单个类（本类）实现的，从而使得细节被封装类起来。内部类
 * 举出所有我们所需要的各种不同action
 * <p>
 * 2 在控制框架中，我们在外围类设计一些元素供一个或者多个内部类使用，避免代码显得笨拙
 */
public class GreenhouseControls extends Controller {

    // 如2，所添加的外围类元素，供LightOn和LightOff共同调用。
    private boolean light = false;

    public class LightOn extends Event {

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Greenhouse water is on";
        }
    }

    public class WaterOff extends Event {

        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "Greenhouse water is off";
        }
    }


    private String thermostat = "Day";

    public class ThermostatNight extends Event {

        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat on night setting";
        }
    }

    public class ThermostatDay extends Event {

        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat on day setting";
        }
    }

    public class Bell extends Event {

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // 如2，所添加的外围类元素，也可以是基类的可供调用的元素。
            // 参考这里的代码和run()里的代码，bell永远不会从列表中删除，
            // 所以在主函数中事件列表中没有加入bell
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Bing!";
        }
    }


    /*
    * 内部类的eventList是一个待执行列表
    * 外围类基类的eventList是一个事件记录簿
    * **/
    public class Restart extends Event {


        private Event[] eventsList;

        public Restart(long delayTime, Event[] eventsList) {
            super(delayTime);
            // 为内部类的列表赋值
            this.eventsList = eventsList;

            // 为外围类的基类的列表赋值
            for (Event e : eventsList)
                addEvent(e);
        }

        @Override
        public void action() {
            //在重启代码中，我们重新添加了主函数中所有事件进入列表
            for (Event e : eventsList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restarting system";
        }
    }

    public static class Terminate extends Event {


        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminating";
        }
    }


}
