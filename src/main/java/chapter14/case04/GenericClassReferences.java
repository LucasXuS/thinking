package chapter14.case04;

/**
 * Created by lenovo on 2018/4/8.
 */
public class GenericClassReferences {

    public static void main(String[] args){
        // 无限定
        Class intClass = int.class;
        // 限定
        Class<Integer> genericIntClass = int.class;
        // 使用?通配符，降低限定
        Class<?> genericNumberClass = Integer.class;
        genericNumberClass = double.class;

        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
    }


}
