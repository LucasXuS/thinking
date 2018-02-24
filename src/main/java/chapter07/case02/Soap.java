package chapter07.case02;


public class Soap {
    private String s;
    Soap(){
        System.out.println("Soap()");
        s = "Constructed";
    }
    @Override
    public String toString(){
        return s;
    }
}
