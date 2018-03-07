package chapter10.case04;


public class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        PDestination(String whereTo) {
            this.label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }

    // 上溯造型，隐藏内部类PDestination，使得用户无法直接使用这个类
    // 阅读源码的过程中，经常觉得有用的类，转向定义文件发现是个接口。
    // 因此很有可能是使用内部类的方式进行了实现，并且进行隐藏。
    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}
