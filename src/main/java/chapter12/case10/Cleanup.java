package chapter12.case10;

/**
 * Created by lenovo on 2018/3/16.
 */
public class Cleanup {

    public static void main(String[] args){
        try {
            InputFile in = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    System.out.println(s);
            }catch (Exception e){
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            }finally {
                in.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
