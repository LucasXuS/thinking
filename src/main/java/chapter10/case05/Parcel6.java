package chapter10.case05;

/**
 * Created by lenovo on 2018/3/7.
 */
public class Parcel6 {
    private void internalTracking(Boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                TrackingSlip(String s) {
                    this.id = s;
                }

                String getSlip() {
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }

        // TrackingSlip ts = new TrackingSlip("x");// 不可使用，超出了TrackingSlip的作用域
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args){
        Parcel6 p = new Parcel6();
        p.track();
    }
}
