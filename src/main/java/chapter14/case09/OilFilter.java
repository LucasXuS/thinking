package chapter14.case09;

public class OilFilter extends Filter {
    public static class Factory implements chapter14.case09.Factory<OilFilter> {
        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}
