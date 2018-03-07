package chapter10.case02;

/**
 * 迭代器设计模式
 */
interface Selector {
    boolean end();

    Object current();

    void next();
}
