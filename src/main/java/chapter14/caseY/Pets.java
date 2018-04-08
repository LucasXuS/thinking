package chapter14.caseY;

import chapter14.case06.Pet;
import chapter14.case06.PetCreator;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/3/12.
 */
public class Pets {
    public static final PetCreator creator =
            new LiteralPetCreator();
    public static Pet randomPet(){
        return creator.randomPet();
    }

    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size){
        return creator.arrayList(size);
    }
}
