package chapter10.case10;

/**
 * 嵌套类：
 * <p>
 * 如果想阻断内部类对象和外围类对象的联系，可以设置内部类为static，
 * 我们通常称之为嵌套类。
 * 另外：
 * 1 要创建嵌套类的对象，不一定需要外围类对象了。
 * 2 不能从嵌套类的对象中访问非静态外围类对象。
 */
public class Parcel11 {

    private static class ParcelContents implements Contents {

        private int i = 11;

        public int value() {
            return i;
        }
    }

    static class ParcelDestination implements Destination {

        private String label;

        public ParcelDestination(String whereTo) {
            this.label = whereTo;
        }

        public String readLabel() {
            return label;
        }

        public static void f() {
        }

        static int x = 10;

        static class AnotherLevel {
            public static void f() {
            }

            static int x = -10;
        }
    }

    public static Destination destination(String s){
        return new ParcelDestination(s);
    }

    public static Contents contents(){
        return new ParcelContents();
    }

    public static void main(String[] args){
        Contents c = contents();

        Destination d = destination("Tasmania");
    }



}
