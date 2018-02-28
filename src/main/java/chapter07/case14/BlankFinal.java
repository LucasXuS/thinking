package chapter07.case14;

/**
 * 空白final
 */
public class BlankFinal {
    private final int i = 0;
    private final int j; // 空白final,如果不立刻赋值，则需要在所有构造函数中赋值

    private final Poppet p; // 空白final,如果不立刻赋值，则需要在所有构造函数中赋值

    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }

    // 添加构造函数后，空白final那句立刻报错，需要立刻赋值。
    public BlankFinal(int x) {
        j = x; // 为j赋值
        p = new Poppet(x);
    }

    public static void main(String[] args){
        new BlankFinal();
        new BlankFinal(47);
    }


}
