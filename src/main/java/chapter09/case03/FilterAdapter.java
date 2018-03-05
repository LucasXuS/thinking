package chapter09.case03;

/**
 * “适配器”设计模式
 * 为了不修改所有的滤波器，甚至不修改Filter，因此要在这里添加一个适配器
 */
public class FilterAdapter implements Processor {
   Filter filter;

    public FilterAdapter(Filter filter){
        this.filter = filter;
    }

    public String name() {
        return filter.name();
    }

    public Object process(Object input) {
        return filter.process((WaveForm)input);
    }
}
