package chapter07.case12;

/**
 * Created by lenovo on 2018/2/28.
 */
public class Car {

    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door left = new Door(), right = new Door();

    public Car() {
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
    }
}
