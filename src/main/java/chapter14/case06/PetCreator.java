package chapter14.case06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by lenovo on 2018/3/12.
 */
public abstract class PetCreator {
    private Random rand = new Random(47);


    // 抽象方法，后面会根据不同的方式实现这个方法。
    public abstract List<Class<? extends Pet>> types();


    // 根据派生类给出的types()生成一个随机的类，再用newInstance创建一个对象
    public Pet randomPet() {
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = randomPet();
        }
        return result;
    }

    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }

}
