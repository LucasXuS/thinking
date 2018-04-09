package chapter14.case05;

/**
 * 新的转型语法
 */
public class ClassCasts {
    public static void main(String[] args){
        Building b = new House();
        // 只有在泛型中更有用。
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
    }
}
