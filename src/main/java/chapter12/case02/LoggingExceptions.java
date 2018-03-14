package chapter12.case02;

/**
 * 异常与记录日志(侧面反映异常的部分打印原理)
 */
public class LoggingExceptions {

    public static void main(String[] args){
        try{
            throw new LoggingException();
        }catch (LoggingException e){
            System.err.println("Caught " + e);
        }
    }
}
