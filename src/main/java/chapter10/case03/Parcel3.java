package chapter10.case03;

/**
 * Created by lenovo on 2018/3/6.
 */
public class Parcel3 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }

    }

    public static void main(String[] args){
        Parcel3 p = new Parcel3();
        // 创建内部类对象一定要用到外部类对象
        // Parcel3.Destination des = new Parcel3.Destination()//这种写法是不正确的。因为内部类对象一定需要一个外部类对象作为支撑。因为存在调用外部类元素的可能性
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("Tasmania");
    }
}
