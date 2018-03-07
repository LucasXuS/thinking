package chapter10.case07;

/**
 * 为匿名内部类创设构造器
 */
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            // 把实例初始化来当做构造器使用。
            {
                System.out.println("Inside instance initializer");
            }

            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args){
        Base base = getBase(47);
        base.f();
        /*
        * output:
        * Base constructor. i = 47
        * Inside instance initializer
        * In anonymous f()
        * **/
    }
}
