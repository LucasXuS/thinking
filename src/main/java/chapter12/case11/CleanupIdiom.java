package chapter12.case11;

/**
 * 关于构造器需要抛出异常且产生对象需要被销毁时的对策。
 */
public class CleanupIdiom {

    public static void main(String[] args) {
        /*
        *
        * thinking in java 的作者认为
        * 在这种情形下，每一个对象被构造后，就必须添加一个try-finally语块
        * **/

        // 对于单个的使用：

        try {
            NeedsCleanup2 nc3 = new NeedsCleanup2();
            try {
                // nc3的使用
            } finally {
                nc3.dispose();
            }
        } catch (ConstructionException e) {
            e.printStackTrace(System.out);
        }

        // 对于多个的使用：
        try {
            NeedsCleanup2 nc = new NeedsCleanup2();
            try {
                // nc的使用
                NeedsCleanup2 nc2 = new NeedsCleanup2();
                try {
                    // nc2的使用
                } finally {
                    nc2.dispose();
                }
            } finally {
                nc.dispose();
            }
        } catch (ConstructionException e) {
            e.printStackTrace(System.out);
        }

        /*
        * finally必须运行（即使try块为空）
        * 嵌套是必须的，因为在最外层写finally,在同级finally块和try块并不是一个作用域，所以
        * 在finally块中读不到try块的信息。
        * **/

        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();

        } catch (ConstructionException e) {
            e.printStackTrace(System.out);
        }finally {
            //nc4.dispose() // 和try不是一个作用域，所以会反应无法识别nc4
        }


    }
}
