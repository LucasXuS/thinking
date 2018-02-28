package chapter07.case10;

/**
 * protected 关键字
 */
public class Orc extends Villain {

    private int orcNumber;

    Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        // 调用protected 函数
        setName(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
        /**
         * output:
         * Orc 12: I'm a villain and my name is Limburger
         * Orc 19: I'm a villain and my name is Bob
         *
         * */
    }
}
