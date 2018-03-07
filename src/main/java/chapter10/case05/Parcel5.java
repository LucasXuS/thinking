package chapter10.case05;

/**
 * 方法和作用域内部的内部类
 * <p>
 * 做的目的：
 * 1 在下所示，我想implements某个接口，并且返回原接口的引用。
 * 2 需要一个类来解决问题，但是不希望这个类是可见的。
 */
public class Parcel5 {

    //目的1 在chapter10.case04所示，我想implements某个接口，并且返回原接口的引用。
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            PDestination(String whereTo) {
                this.label = whereTo;
            }

            public String readLabel() {
                return label;
            }
        }
        return new PDestination("Tasmania");
    }
}
