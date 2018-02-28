package chapter07.case12;

/**
 * 关系继承和组合的内涵
 */
public class Truck extends Car {

    public Hook hook = new Hook();

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.hook.hookUp();
        truck.left.window.rolldown();
        /**
         *
         * 组合技术表达的是has-a的含义。如：Car has door, Car has engine，Truck has hook
         * 继承技术表达的是is-a的含义。如：Truck is car
         *
         * */

    }
}
