package chapter10.case08;

/**
 * 利用实例初始化做构造函数，但是缺点是没有办法做重载函数。
 */
public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {

            private int cost;

            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget!");
                }
            }

            private String label = dest;

            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args){
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395f);
    }
}
