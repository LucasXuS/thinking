package chapter10.case11;

/**
 * 在接口内部创建类
 */
public interface ClassInInterface {
    void howdy();

    /*
    * 这是一个编写测试的好方法。
    * 以前可以通过在类中编写main函数达到测试本类的目的，
    * 但是这些测试代码会被编译后放在正式环境中，是的正式
    * 环境有一大堆无意义的代码。而编写测试类就完全不同，
    * 因为在编译打包后，把相应的测试类文件删除就好。
    * 在此处，我们要删除ClassInInterface$Test.class
    * **/
    class Test implements ClassInInterface{

        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args){
            new Test().howdy();
        }
    }
}
