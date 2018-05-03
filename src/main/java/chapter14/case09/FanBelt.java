package chapter14.case09;

public class FanBelt extends Belt {

    public static class Factory implements chapter14.case09.Factory<FanBelt> {

        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
