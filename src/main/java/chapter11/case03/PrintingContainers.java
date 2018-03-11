package chapter11.case03;

import java.util.*;

import static util.Print.print;

/**
 * 三种容器的细微差别
 */
public class PrintingContainers {

    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        print(fill(new ArrayList<>()));
        print(fill(new LinkedList<>()));

        // 速度最快
        print(fill(new HashSet<>()));
        // 按照升序排序
        print(fill(new TreeSet<>()));
        // 按照插入顺序排序
        print(fill(new LinkedHashSet<>()));
        // 速度最快
        print(fill(new HashMap<>()));
        // 按照升序排序
        print(fill(new TreeMap<>()));
        // 按照插入顺序排序
        print(fill(new LinkedHashMap<>()));
    }
}
