package chapter14.case09;

public class FuelFilter extends Filter {
    public static class Factory implements chapter14.case09.Factory<FuelFilter> {
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
