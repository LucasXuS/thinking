package chapter14.case09;

public class AirFilter extends Filter{

    public static class Factory implements chapter14.case09.Factory<AirFilter> {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
