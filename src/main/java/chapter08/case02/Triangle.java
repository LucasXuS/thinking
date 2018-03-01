package chapter08.case02;
import static util.Print.print;
/**
 * Created by lenovo on 2018/3/1.
 */
public class Triangle extends Shape {
    @Override
    public void draw(){
        print("Triangle.draw()");
    }
    @Override
    public void erase(){
        print("Triangle.erase()");
    }
}
