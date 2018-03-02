package chapter08.case08;

/**
 * 清理时可能会出现由于覆盖而导致基类子对象没有被清理的问题
 *
 * 正确的方法是在清理函数中调用super.dispose()
 * 另外，先清理派生类，后清理基类
 */
public class Frog {
}
