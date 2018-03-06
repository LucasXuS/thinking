package chapter10.case01;

/**
 * 通过函数向外部给出内部类对象
 */
public class Parcel2 {
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

    // 内部类常见的使用方法
    public Destination to(String s){
        return new Destination(s);
    }

    public Contents contents(){
        return new Contents();
    }

    // 使用内部类
    public void ship(String dest){
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args){
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();

        // 在外部创建内部类对象方法
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }
}
