package chapter08.case09;

import static chapter06.case01.Print.print;

/**
 * Created by lenovo on 2018/3/2.
 */
public class Composing {
    private Shared shared;
    // 编码生成器，因为是静态对象，所以不会因为新的对象生成而清零。随着对象个数增大。
    // 之所以是long是为了防止对象太多数据溢出
    private static long counter = 0;
    // 因为id是每个对象的不变属性，所以id必须是final
    private final long id = counter++;

    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }


    protected void dispose(){
        print("disposing " + this);

        shared.dispose();
    }

    @Override
    public String toString(){
        return "Composing " + id;
    }
}
