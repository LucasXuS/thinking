package chapter11.case11;

import chapter14.case06.Pet;
import chapter14.caseY.Pets;

import java.util.*;

/**
 * C++ : 各种容器之间没有任何联系，依靠iterator联系
 * Java：Collection描述所有容器的共性，所有容器通过实现这个接口获得。
 * 但是，iterator也是不可避免的，因为Collection在描述所有容器共性的
 * 时候加入了iterator
 */
public class InterfaceVsIterator {

    public static void display(Iterator<Pet> iterator) {
        while (iterator.hasNext()) {
            Pet p = iterator.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        for (Pet p : pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> petList = Pets.arrayList(8);
        Set<Pet> petSet = new HashSet<>(petList);

        Map<String, Pet> petMap = new LinkedHashMap<>();
        String[] names = "Ralph Eric Robin Lacey Britney Sam Spot Fluffy".split(" ");
        for (int i = 0; i < names.length; i++) {
            petMap.put(names[i], petList.get(i));
        }

        display(petList);
        display(petSet);
        display(petList.iterator());
        display(petSet.iterator());
        display(petMap.values());
        display(petMap.values().iterator());

        System.out.println(petMap);
        System.out.println(petMap.keySet());

    }

}
