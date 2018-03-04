package chapter09.case03;
import static util.Print.print;
/**
 * "策略"设计模式
 */
public class Apply {

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
