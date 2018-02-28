package chapter07.case11;

/**
 * 上溯造型
 */
public class Wind extends Instrument {
    public static void main(String[] args){
        Wind flute = new Wind();
        // 参数类型为Instrument，却可以将子类放进去。
        // 代码只是将Wind引用转换为Instrument引用，之所以能够接受Wind引用，因为“新类是基类的一种类型”
        Instrument.tune(flute);

        /**
         * thinking in java 原文：
         * 为新的类提供方法，并不是继承关系中最重要的部分，其最重要的方面，是表现
         * 新类和基类之间的关系。这种关系可以用 “新类是基类的一种类型”加以概括
         *
         * */
    }
}
