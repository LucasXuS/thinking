package chapter10.case06;

/**
 * 匿名内部类
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents() {

            private int i = 11;

            public int value() {
                return i;
            }
        };
    }

    public void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
