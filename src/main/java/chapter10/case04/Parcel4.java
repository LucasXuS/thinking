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
    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}
