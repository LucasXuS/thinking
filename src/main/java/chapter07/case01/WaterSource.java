package chapter07.case01;


public class WaterSource {
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s = "Constructed";
    }
    @Override
    public String toString(){
        return s;
    }
}
