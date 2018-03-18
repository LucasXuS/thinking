package chapter13.case01;

import java.util.Random;

/**
 * 字符串拼接的机理：
 * 字符串直接相加，实际上编译器在内部调用了StringBuilder,StringBuilder是一个非常高效的拼接字符串的方案
 * <p>
 * StringBuilder拼接字符串机理：
 * StringBuilder之所以高效，原理如下：
 * 和C一样，Java的字符串是基于字符数组。调用append后，位于StringBuilder内部的字符数组value
 * 先扩充size,然后将新的数组衔接到老的数组里面去。
 * <p>
 * 从内存的角度来看，每次扩充是要重新构建字符数组，所以要消耗一定内存
 * 从运算角度看，字符串拼接的关键方法Arrays.copy()是个native方法，意味着这是一个由C语言编写的方法，速度
 * 比Java方法更快，
 * <p>
 * 所以调用append方法后，并不会产生新的String对象，但是使用stringBuilder.toString()才会把内部的char[] value
 * 转换为String
 */
public class UsingStringBuilder {


    // base1 和 base2的代码完全一样，包括内部机理，在这种情况下，IntelliJ IDEA推荐base1,因为可读性更好。

    public String base1() {
        String stringBuilder = "My" +
                " name" +
                " is" +
                " Gordon";
        return stringBuilder;
    }

    public String base2() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("My");
        stringBuilder.append(" name");
        stringBuilder.append(" is");
        stringBuilder.append(" Gordon");
        return stringBuilder.toString();
    }


    // explicit 和 implicit 并不一样，在转化为汇编语言后，explicit创建 StringBuilder的创建
    // 在循环外部，因此只会创建一次StringBuilder对象。但是在implicit中，StringBuilder是依靠
    // 自动生成，创建在循环内部，消耗了大量资源。IntelliJ IDEA也推荐explicit。

    public String explicit(String[] fields) {
        StringBuilder result = new StringBuilder();
        for (String field : fields) result.append(field);
        return result.toString();
    }

    public String implicit(String[] fields) {
        String result = "";
        for (String field : fields) result += field;
        return result;
    }


    public static Random random = new Random(47);

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < 25; i++) {
            stringBuilder.append(random.nextInt(100));
            stringBuilder.append(", ");
            // 如果在这里使用stringBuilder.append(random.nextInt(100) + ", ")就前功尽弃了，因为在这里编译器会在每次循环时重新创建StringBuilder
            // 同样会消耗大量内存。
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usingStringBuilder = new UsingStringBuilder();
        System.out.println(usingStringBuilder.toString());
    }


}
