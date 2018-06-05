package chapter14.case11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static chapter06.case01.Print.print;

/*
* RTTI 我们之前讨论过，我们可以从
*
* */

public class ShowMethods {

    private static String usage = "usage:\n" +
            "ShowMethods qualified.class.name\n" +
            "To show all methods in class or:\n" +
            "ShowMethods qualified.class.name word\n" +
            "To search for methods involving ‘word’";

    public static void main(String[] args) {
        if (args.length < 1) {
            print(usage);
            System.exit(0);
        }
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] constructors = c.getConstructors();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
