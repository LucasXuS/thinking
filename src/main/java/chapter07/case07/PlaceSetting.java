package chapter07.case07;
import static chapter06.case01.Print.*;
/**
 * 组合和继承的同时使用
 */
public class PlaceSetting extends Custom{
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;


    PlaceSetting(int i) {
        super(i + 1);

        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        print("PlaceSetting constructor");
    }

    public static void main(String[] args){
        PlaceSetting x = new PlaceSetting(9);
        /**
         * output:
         * Custom constructor with 10
         * Utensil constructor with 11
         * Spoon constructor with 11
         * Utensil constructor with 12
         * Fork constructor with 12
         * Utensil constructor with 13
         * Knife constructor with 13
         * Plate constructor with 14
         * DinnerPlate constructor with 14
         * PlaceSetting constructor
         *
         * */
    }
}
