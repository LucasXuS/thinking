package chapter07.case07;
import static chapter06.case01.Print.*;
/**
 * Created by lenovo on 2018/2/26.
 */
public class Knife extends Utensil {
    Knife(int i){
        super(i);
        print("Knife constructor with " + i);
    }
}
