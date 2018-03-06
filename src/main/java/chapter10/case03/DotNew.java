package chapter10.case03;

/**
 * 创建“基于某外围类对象的内部类对象”
 */
public class DotNew {

    public class Inner{}

    public static void main(String[] args){
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
