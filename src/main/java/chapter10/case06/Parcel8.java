package chapter10.case06;

/**
 * 带参的匿名内部类
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        // 实际上是个Wrapping的派生类
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
