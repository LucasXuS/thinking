package chapter12.case02;

/**
 * Created by lenovo on 2018/3/14.
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
