package chapter08.case09;

import static util.Print.print;


// 共享对象
public class Shared {

    // 共享次数计数器
    private int refcount = 0;
    // 之所以是long是为了防止对象太多数据溢出
    private static long counter = 0;
    // 编号，作为共享对象，只初始化一次，这个只有一个id为0的对象
    private final long id = counter++;

    public Shared() {
        print("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        // 当共享它的所有对象被释放后，share才会被释放
        if (--refcount == 0) {
            print("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}
