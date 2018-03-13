package chapter11.case09;

import chapter14.caseX.*;
import util.Print;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 利用map 和 list 结合很容易把维度增加，存储更多信息
 */
public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople
            = new HashMap<>();

    // 静态实例初始化
    static {
        petPeople.put(new Person("Dawn"),
                Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May"), new Dog("Margrett")));
        petPeople.put(new Person("Marilyn"),
                Arrays.asList(
                        new Pug("Tom")
                        , new Cat("Jerry")
                        , new Cat("Pinkola")));
        petPeople.put(new Person("Luke"),
                Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
        petPeople.put(new Person("Isaac"),
                Arrays.asList(new Rat("Freckly")));
    }

    public static void main(String[] args) {
        Print.print("People: " + petPeople.keySet());
        Print.print("Pets: " + petPeople.values());
        for (Person person : petPeople.keySet()) {
            Print.print(person + " has:");
            for (Pet pet : petPeople.get(person))
                Print.print("     " + pet);
        }

    }
}
