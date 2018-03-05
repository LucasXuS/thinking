package chapter09.case08;

/**
 * 组合接口时的名字冲突
 */

public class C {
}

// 由于I1，I2中f()的返回值类型不同，所以会造成冲突
//public class C implements I1, I2 {
//    public int f() {
//        return 0;
//    }
//}
