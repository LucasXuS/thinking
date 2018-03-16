package chapter12.case07;

/**
 * 利用finally 实现程序的多次尝试机制
 */
public class FinallyWorks {

    // 利用count 计数
    static int count = 0;

    public static void main(String[] args){
        while (true){
            try {
                if(count++ == 0)
                    throw new ThreeException();
                System.out.println("No Exception");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            }finally {
                System.out.println("In finally clause");
                // 设置尝试次数
                if(count == 2)
                    break;
            }
        }
    }
}
