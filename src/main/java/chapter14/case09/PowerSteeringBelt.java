package chapter14.case09;

public class PowerSteeringBelt extends Belt {
    public static class Factory implements chapter14.case09.Factory<PowerSteeringBelt> {

        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
