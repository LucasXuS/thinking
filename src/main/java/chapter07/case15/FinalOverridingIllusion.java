package chapter07.case15;
import static util.Print.print;

/**
 * 使用final方法的原因有两个
 * 1 把方法锁定，防止任何类重写这个函数
 * 2 早期final函数会被当作内联函数。但是这个作用被逐渐舍弃。
 *
 * 所有的private方法被隐式指定为final函数。
 */
public class FinalOverridingIllusion {
}
