package chapter08.case02;
import static chapter06.case01.Print.print;
/**
 * Created by lenovo on 2018/3/1.
 */
public class Circle extends Shape{
    @Override
    public void draw(){
        print("Circle.draw()");
    }
    @Override
    public void erase(){
        print("Circle.erase()");
    }
}
