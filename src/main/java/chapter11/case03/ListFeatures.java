package chapter11.case03;

import chapter14.caseX.Cymric;
import chapter14.caseX.Hamster;
import chapter14.caseX.Mouse;
import chapter14.caseX.Pet;
import chapter14.caseY.Pets;

import java.util.*;

import static util.Print.print;

/**
 * List的基本操作
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        // 生成随机的ArrayList,里面的元素都是Pet的派生类
        List<Pet> pets = Pets.arrayList(7);
        print("1: " + pets);

        // 添加元素
        Hamster h = new Hamster();
        pets.add(h);
        print("2: " + pets);

        // 查看是否包含元素
        print("3: " + pets.contains(h));

        // 删除元素
        pets.remove(h);

        // 用序号检索元素或者用元素检索序号
        Pet p = pets.get(2);
        print("4: " + pets.indexOf(p));

        // 在元素不存在的时候尝试检索序号
        Pet cymric = new Cymric();
        print("5: " + pets.indexOf(cymric));// 返回-1标识检索失败

        // 在元素不存在的时候尝试删除元素
        print("6: " + pets.remove(cymric)); // 返回false表示删除失败

        // 正确删除的返回值
        print("7: " + pets.remove(p));

        // 删除后的效果
        print("8: " + pets);

        // 用序号添加一个元素
        pets.add(3, new Mouse());
        print("9: " + pets);

        // 用序列号提取子序列
        List<Pet> sub = pets.subList(1, 4);
        print("subList: " + sub);

        // 批量查询是否存在
        print("10: " + pets.containsAll(sub));

        // 排序
        Collections.sort(sub);
        print("sorted subList: " + sub);

        print("11: " + pets.containsAll(sub));

        // 打乱列表顺序
        Collections.shuffle(sub, rand);
        print("shuffled subList: " + sub);

        print("12: " + pets.containsAll(sub));

        // 复制列表
        List<Pet> copy = new ArrayList<>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        print("sub: " + sub);

        //取得两个列表的交集，并且返回给copy
        copy.retainAll(sub);
        print("13: " + copy);


    }
}
