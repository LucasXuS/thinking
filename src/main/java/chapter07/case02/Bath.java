package chapter07.case02;

/*
 * 对象初始化：
 * 1 在定义对象的地方。这意味着它们总能在构造器被调用之前初始化
 * 2 在构造器中初始化
 * 3 在正要使用这些对象之前，我们称之为惰性初始化，其优势在于最大化的避免了额外的开销
 * 4 使用其他实例初始化
 * */
public class Bath {
    private String // 在定义处初始化
            s1 = "Happy",
            s2 = "Happy",
            s3, s4;
    private Soap soap;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Inside Bath()");
        // 构造器中初始化
        s3 = "Joy";
        toy = 3.14f;
        soap = new Soap();
    }

    {
        i = 47;//实例初始化，在构造代码块中初始化，构造代码块将早于构造函数运行。
        System.out.println("instance initialization");
    }

    public String toString() {
        if (s4 == null) {// 惰性初始化
            s4 = "joy";
        }
        return "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "soap = " + soap;
    }

    public static void main(String[] args){
        Bath bath = new Bath();
        System.out.println(bath);
        /*
        * output:
        * instance initialization
        * Inside Bath()
        * Soap()
        * s1 = Happy
        * s2 = Happy
        * s3 = Joy
        * s4 = joy
        * i = 47
        * toy = 3.14
        * soap = Constructed
        * */

        /**
         * 代码块的使用请移步extra01，我们可以通过运行结果看到，其运行顺序早于构造函数
         */
    }
}
