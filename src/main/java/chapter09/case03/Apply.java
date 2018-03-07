package chapter09.case03;
import static util.Print.print;
/**
 * "策略"设计模式与不使用接口带来的不便
 */
public class Apply {

    /*
    * Processor 和 Filter 具有相同的接口元素。
    * 但是我们却无法将这二者都运用到process()中去。原因是两个：
    *
    * 1 在代码开发的过程中Filter的作者根本没有考虑过其他开发者想把Filter当
    * 作Processor使用
    * 2 Apply.process 和 Processor 耦合过紧。
    * **/

    public static void process(Processor p, Object s){
        print("Using Processor " + p.name());
        print(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args){
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
        /*
        * output:
        * Using Processor Upcase
        * DISAGREEMENT WITH BELIEFS IS BY DEFINITION INCORRECT
        * Using Processor Downcase
        * disagreement with beliefs is by definition incorrect
        * Using Processor Splitter
        * [Disagreement, with, beliefs, is, by, definition, incorrect]
        *
        * **/
    }
}
