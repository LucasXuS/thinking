package chapter10.case14;

/**
 * Created by lenovo on 2018/3/7.
 */
public class MultiImplementation {
    static void takesD(D d){}
    static void takesE(E e){}

    public static void main(String[] args){
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}
