package chapter08.case06;

/**
 * Created by lenovo on 2018/3/2.
 */
public class StaticSub extends StaticSuper {

    public static String staticGet() {
        return "Derived staticGet()";
    }

    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}
