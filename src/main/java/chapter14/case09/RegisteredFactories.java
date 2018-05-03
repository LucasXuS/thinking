package chapter14.case09;


/**
 * 注册工厂
 *
 * 我们要去除PetCreator这种类，将所有列表干脆写进系统的基类里面。
 *
 *
 * */
public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(Part.randomCreate());
        }
    }
}
