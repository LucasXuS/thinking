package chapter14.case09;

public class CabinFilter extends Filter {
    public static class Factory implements chapter14.case09.Factory<CabinFilter> {
        @Override
        public CabinFilter create() {
            return new CabinFilter();
        }
    }
}
