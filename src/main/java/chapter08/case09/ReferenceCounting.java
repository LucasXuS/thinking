package chapter08.case09;

/**
 * 共享对象通过计数进行初始化或销毁。
 */
public class ReferenceCounting {
    public static void main(String[] args) {
        // 共享对象。
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };
        for(Composing c : composing){
            c.dispose();
        }

        /*
        * output：
        * Creating Shared 0
        * Creating Composing 0
        * Creating Composing 1
        * Creating Composing 2
        * Creating Composing 3
        * Creating Composing 4
        * disposing Composing 0
        * disposing Composing 1
        * disposing Composing 2
        * disposing Composing 3
        * disposing Composing 4
        * Disposing Shared 0
        * **/
    }
}
