package chapter08.case04;
import static util.Print.print;
/**
 * 私有方法不可被覆盖
 */
public class PrivateOverride {
    /*
    * 当f()设置为 final public，派生类定义f()会报错
    * 所以只能设置为private
    * **/

    private void f(){
        print("private f()");
    }

    public static void main(String[] args){
        // 上溯造型
        PrivateOverride po = new Derived();
        po.f();
        /*
        * output:
        * private f()
        * **/

        /*
        * 矛盾之处：
        * 根据“覆盖”的定义（chapter07 case15），显然，函数没有被覆盖
        * 根据后期绑定的规则，在上溯造型以后po.f()应该输出 public f()
        *
        * 原因：
        * 1 首先，在其他类中，po.f()的写法会报错。因为发f()是私有的，
        * 所以其他类中不可能直接调用
        * 2 由于private 包含final特性，派生类访问不到基类的f()。所以
        * 基类的f()和派生类的f()是完全不同的函数。所以不存在“选择绑
        * 定哪个函数”的过程
        *
        * 在程序设计中，要避免派生类函数名和基类的私有函数名称相同。
        * 因为在使用多态时，也许会出现不可预料的问题。
        *
        * **/
    }
}
