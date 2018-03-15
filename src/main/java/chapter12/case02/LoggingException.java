package chapter12.case02;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by lenovo on 2018/3/14.
 */
public class LoggingException extends Exception {

    private static Logger logger =
            Logger.getLogger("LoggingException");

    public LoggingException(){
        StringWriter trace = new StringWriter();
        // 为trace赋值
        printStackTrace(new PrintWriter(trace));
        // 打印错误以及错误路径
        logger.severe(trace.toString());
        /*
        * 通过源码阅读，大概是如下流程：
        * StringWriter 是writer的一个派生类，PrintWriter
        * 虽然同为writer,但是需要一个Writer进行构造，成为其核心
        *
        * PrintWriter有函数println，这个函数在不同的writer中
        * 功能不一样（来自于核心函数write(),这是基类Writer的一个抽象函数）
        * 当System.out(虽然是stream，在PrintWriter中会被转换为BufferedWriter)
        * 使用就是打印内容，StringWriter使用就是append一个字符串
        *
        * printStackTrace，内部会直接调用 println函数，但是PrintWriter是自定义的
        * 默认为（System.err）。所以，在没有参数，或者以System.out,System.err的
        * 时候我们可以在控制台看到，但是使用StringWriter，我们看不到任何输出，
        * 而是在为StringWriter(此处为trace)赋值。
        *
        * **/
    }

    // 测试StringWriter
    public static void main(String[] args){
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println("test");
        System.out.print(stringWriter.toString());

    }
}
