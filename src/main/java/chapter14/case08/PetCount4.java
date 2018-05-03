package chapter14.case08;

import chapter14.case06.Pet;
import chapter14.case07.Pets;
import static chapter06.case01.Print.*;

public class PetCount4 {

    public static void main(String[] args){
        TypeCounter counter = new TypeCounter(Pet.class);
        for(Pet pet : Pets.createArray(20)){
            printnb(pet + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
}
