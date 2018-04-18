package chapter09.case03;

/**
 * 修改之前，这是一个类，经过代码修改改为了一个接口
 */
public interface Processor {
    public String name();

    Object process(Object input);
}
