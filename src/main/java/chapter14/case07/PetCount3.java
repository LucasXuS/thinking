package chapter14.case07;


import chapter14.case06.Pet;
import chapter17.caseY.MapData;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by xusong on 2018/4/13.
 */
public class PetCount3 {


    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter(){
            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }

        // 获取所有键值对，通过遍历计算
        public void count(Pet pet){
            for(Map.Entry<Class<? extends Pet>, Integer> pair: entrySet()){
                if(pair.getKey().isInstance(pet)){
                    put(pair.getKey(), pair.getValue() + 1);
                }
            }
        }

        @Override
        public String toString(){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{");
            for(Map.Entry<Class<? extends Pet>, Integer> pair: entrySet()){
                stringBuilder.append(pair.getKey());
                stringBuilder.append("=");
                stringBuilder.append(pair.getValue());
                stringBuilder.append(", ");
            }
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        PetCounter petCounter = new PetCounter();
        for (Pet pet : Pets.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            petCounter.count(pet);
        }

        System.out.println();
        System.out.println(petCounter);

    }
}
