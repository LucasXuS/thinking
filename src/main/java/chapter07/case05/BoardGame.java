package chapter07.case05;
import static chapter06.case01.Print.*;

/**
 * Created by lenovo on 2018/2/26.
 */
public class BoardGame extends Game {
    //不管派生类的构造函数是否带参，只要调用super(i)即可
    BoardGame(int i) {
        super(i);//不写会报错
        print("BoardGame constructor with " + i);
    }
}
