package chapter12.case09;

/**
 * 在基类或者接口中的方法有异常时，在派生类编写的时候有如下限制：
 * 1 当基类构造函数中有异常说明时，编译器会强制要求在派生类的构造函数中
 * 写上同样的异常说明(不可减少，但是可以增加异常说明)。
 * 2 所有被覆写的函数未必要加上和底层一样的异常说明,且可以减少异常说明,
 * 但是不可添加异常说明
 * 3 当 继承或者实现多个接口，碰巧同一个函数抛出不同异常而产生冲突时，编译器
 * 强制要求在新的函数中取消异常说明
 * <p>
 * 4 对于构造器重载的情况，仍然要添加无参构造器的异常说明
 * 基类有参构造器存在异常说明,同时无参构造器无异常说明时,
 * 所有构造器均不会被强制添加异常说明
 * <p>
 * 5 我们可以throw 异常的派生类代替基类
 */
public class StormyInning extends Inning implements Storm {

    // 如规则1
    public StormyInning() throws BaseballException, RainedOut {

    }

    // 如规则4
    public StormyInning(String s) throws Foul, BaseballException {

    }

    // 如规则5
    @Override
    public void atBat() throws PopFoul {

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    // 如规则3
    // 非常容易理解，根据规则2，不管添加哪一个异常说明对另一个异常而言都是“添加异常说明”
    // 所以只有都不写才能符合要求。
    @Override
    public void event() {
    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}
