package chapter12.case02;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * 记录他人编写的Exception——编程中更加常见的操作。
 */
public class LoggingExceptions2 {
    private static Logger logger =
            Logger.getLogger("LoggingExceptions2");

    static void logException(Exception e){
        StringWriter trace = new StringWriter();
        // 不负责输出
        e.printStackTrace(new PrintWriter(trace));
        String s = trace.toString();
        // 负责输出
        logger.severe(s);
    }

    public static void main(String[] args){
        try {
            throw new NullPointerException();
        }catch (NullPointerException e){
            logException(e);
        }

    }
}
