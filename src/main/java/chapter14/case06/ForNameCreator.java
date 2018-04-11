package chapter14.case06;

import java.util.ArrayList;
import java.util.List;

/**
 * 利用forName生成类列表
 */
public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types = new ArrayList<>();


    private static String[] typeNames = {
            "chapter14.case06.Mutt",
            "chapter14.case06.Pug",
            "chapter14.case06.EgyptianMau",
            "chapter14.case06.Manx",
            "chapter14.case06.Cymric",
            "chapter14.case06.Rat",
            "chapter14.case06.Mouse",
            "chapter14.case06.Hamster"

    };

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }


    private static void loader(){
        try {
            for(String name : typeNames){
                types.add((Class<? extends Pet>)Class.forName(name));
            }
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

    static {
        loader();
    }


}
