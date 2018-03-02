package chapter08.case05;
import static util.Print.print;
/**
 * Created by lenovo on 2018/3/2.
 */
public class Sub extends Super {
    public int field = 1;
    public int getField(){
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}
