package chapter14.case09;

public class GeneratorBelt extends Belt {
    public static class Factory implements chapter14.case09.Factory<GeneratorBelt> {

        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
