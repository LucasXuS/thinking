package chapter07.case01;

/**
 * 类复用的策略：
 * 组合技术：将某个类的对象引用放进另一个类中
 */
public class SprinklerSystem {
    // String 类型
    private String value1, value2, value3, value4;
    //核心：将非基本类型WaterSource的对象引用放进这个类中
    private WaterSource source = new WaterSource();
    // 基本类型
    private int i;
    private float f;

    @Override
    public String toString() {
        return "value1 = " + value1 + " " +
                "value2 = " + value2 + " " +
                "value3 = " + value3 + " " +
                "value4 = " + value4 + " " +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;
    }

    public static void main(String[] args){
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
        /*
        * output:
        * WaterSource()
        * value1 = null value2 = null value3 = null value4 = null i = 0 f = 0.0 source = Constructed
        * */

        /*
        * 说明：
        * 这段程序我们有五点收获：
        *
        * 1 把一个类的对象嵌入到另一个类就是组合技术，这是类复用的一个策略
        *
        * 2 toString()是父类Object的一个函数。我们可以覆写这个函数
        *
        * 3 System.out.println(sprinklerSystem)，编译器会自动运行
        * System.out.println(sprinklerSystem.toString())
        * "source = " + source 会自动运行 "source = " + source.toString()
        * 这点和python有异曲同工之妙
        *
        * 4 String 类型初始化为null，int 类型初始化为0，float类型初始化为0.0
        *
        * 5 打印空值会打印出null 而不会报错。
        * */


    }





}
