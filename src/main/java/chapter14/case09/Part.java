package chapter14.case09;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part {

    @Override
    public String toString(){
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> factories = new ArrayList<>();

    static {
        factories.add(new AirFilter.Factory());
        factories.add(new CabinFilter.Factory());
        factories.add(new FanBelt.Factory());
        factories.add(new FuelFilter.Factory());
        factories.add(new GeneratorBelt.Factory());
        factories.add(new OilFilter.Factory());
        factories.add(new PowerSteeringBelt.Factory());
    }

    private static Random rand = new Random(47);

    public static Part randomCreate(){
        int n = rand.nextInt(factories.size());
        return factories.get(n).create();
    }


}
