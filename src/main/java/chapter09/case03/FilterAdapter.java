package chapter09.case03;

/**
 * “适配器”设计模式
 * 为了不修改所有的滤波器（是上层的代码，我们无权修改），因此要在这里添加一个适配器
 *
 * 首先注意我们修改代码时的身份：我们是底层开发者，我们无权动上层开发者的代码（Filter系列开发者），我们要做的，只
 * 能是优化结构，接纳新的代码，让代码的复用性更强。
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
