package chapter14.case02;

/**
 * 对Class用泛型，类型需要极端精确。
 */
public class GenericToyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<FancyToy> ftClass = FancyToy.class;
        // 必须精确地写明类型
        FancyToy fancyToy = ftClass.newInstance();

        // 由于一个类的超类可能有多个（在本例中FancyToy extends Toy extends Object）
        // 因此，我们获取超类的类型的时候必须标注“这是FancyToy的超类”

        // 注明这是FancyToy的超类
        Class<? super FancyToy> up = ftClass.getSuperclass();
        // 用up创建对象，只能创建Object
        Object object = up.newInstance();

    }
}
