package chapter08.case02;
import static util.Print.print;
/**
 * Created by lenovo on 2018/3/1.
 */
public class Square extends Shape {
    @Override
    public void draw(){
        print("Square.draw()");
    }
    @Override
    public void erase(){
        print("Square.erase()");
    }
}
