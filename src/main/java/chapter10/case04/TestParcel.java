package chapter10.case04;

/**
 * 内部类与上溯造型
 */
public class TestParcel {
    public static void main(String[] args){
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");

    }
}
