package chapter11.case03;
import chapter14.caseX.Pet;
import chapter14.caseY.Pets;

import java.util.List;
import java.util.Random;

import static util.Print.*;
/**
 * Created by lenovo on 2018/3/12.
 */
public class ListFeatures {
    public static void main(String[] args){
        Random rand = new Random(47);
        // 生成基于随机的基于数组的ArrayList,里面的元素都是Pet的派生类
        List<Pet> pets = Pets.arrayList(7);


    }
}
