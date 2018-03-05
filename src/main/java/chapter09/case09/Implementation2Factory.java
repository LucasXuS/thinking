package chapter09.case09;

/**
 * Created by lenovo on 2018/3/5.
 */
public class Implementation2Factory implements ServiceFactory  {
    public Service getService() {
        return new Implementation2();
    }
}
