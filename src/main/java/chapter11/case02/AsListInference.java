package chapter11.case02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by xusong on 2018/3/11.
 */
public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        // Thinking in java 是基于JAVA 1.5 编写的教材，笔者通过java 1.8编译器运行时发现是可以使用的。
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());

        //利用Collections.addAll()必须预先初始化
        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy());

        // 显然，随着JAVA的发展，我们已经不需要类型参数说明了。只要List的泛型说明是所有元素的类型的基类即可。
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());

    }
}
