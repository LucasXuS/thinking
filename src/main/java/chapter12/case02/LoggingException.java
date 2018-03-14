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
    }
}
