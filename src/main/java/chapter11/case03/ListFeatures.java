package chapter11.case03;

import chapter14.case06.Cymric;
import chapter14.case06.Hamster;
import chapter14.case06.Mouse;
import chapter14.case06.Pet;
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

        /*
        * 实际上，检索和删除都会用到object底层的equals()方法。
        * 在Pet中，我们把这个equals方法做了重写，通过判断类型是否一致，
        * 名称是否一致，散列值是否一致三个指标来判断两个对象是否相同
        * **/

        // 正确删除的返回值
        print("7: " + pets.remove(p));

        // 删除后的效果
        print("8: " + pets);

        // 用序号添加一个元素
        pets.add(3, new Mouse());
        print("9: " + pets);

        /*
        * 对于LinkedList在猎鸟中间插入和删除都是廉价操作。
        * 对于ArrayList，这是代价高昂的操作。
        *
        * **/

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

        // 单个删除和批量删除
        copy = new ArrayList<>(pets);
        copy.remove(2);
        print("14: " + copy);
        copy.retainAll(sub);
        print("15: " + copy);

        // 修改元素
        copy.set(1, new Mouse());
        print("16: " + copy);

        // 在指定位置批量添加文件
        copy.addAll(2, sub);
        print("17: " + copy);

        // 判断列表是否为空
        print("18: " + pets.isEmpty());

        // 清空列表
        pets.clear();
        print("19: " + pets);
        print("20: " + pets.isEmpty());

        pets.addAll(Pets.arrayList(4));
        print("21: " + pets);

        // 列表转数组
        Object[] o = pets.toArray();
        print("22: " + o[3]);

        // toArray()返回的是Object[]，为了返回其他类型，一定要加个参数
        // 生成的Pet数组的长度，是new Pet[x] 中的x与pets.size()里面比较大的一个。
        Pet[] pa = pets.toArray(new Pet[0]);
        print("length of pa: " + pa.length);
        print("22: " + pa[3].id());


    }
}
