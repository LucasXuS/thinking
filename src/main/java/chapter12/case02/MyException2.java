package chapter12.case02;

/**
 * 进一步自定义异常
 */
public class MyException2 extends Exception{
    private int x;
    public MyException2(){}
    public MyException2(String msg){
        super(msg);
    }

    public MyException2(String msg, int x){
        super(msg);
        this.x = x;
    }

    @Override
    public String getMessage(){
        return "Detail Message: " + x + " " + super.getMessage();
    }


}
