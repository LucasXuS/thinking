package chapter07.case10;

/**
 * Created by lenovo on 2018/2/28.
 */
public class Villain {
    private String name;

    protected void setName(String name) {
        this.name = name;
    }

    Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I'm a villain and my name is " + name;
    }

}
