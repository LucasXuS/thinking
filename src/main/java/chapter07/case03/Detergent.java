package chapter07.case03;

/**
 * 类复用的策略：
 * 继承技术
 */
public class Detergent extends Cleanser{
    @Override
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam(){
        append(" foam()");
    }

    public static void main(String[] args){
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Test base class:");
        Cleanser.main(args);
        /*
        * output:
        * Cleanser dilute() apply() Detergent.scrub() scrub() foam()
        * Test base class:
        * Cleanser dilute() apply() scrub()
        * **/

    }




}
