package chapter07.case08;
import static util.Print.*;
/**
 * Created by lenovo on 2018/2/27.
 */
public class Triangle extends Shape{
    Triangle(int i) {
        super(i);
        print("Drawing Triangle");
    }
    @Override
    void dispose(){
        print("Erasing Triangle");
        super.dispose();
    }
}
