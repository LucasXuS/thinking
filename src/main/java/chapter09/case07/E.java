package chapter09.case07;

/**
 * Created by lenovo on 2018/3/5.
 */
interface E {
    interface G{
        void f();
    }

    public interface H{
        void f();
    }

    // 在接口内部不可再创建私有接口
    // private interface I{}

    void g();
}
