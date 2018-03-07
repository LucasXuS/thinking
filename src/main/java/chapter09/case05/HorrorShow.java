package chapter09.case05;

/**
 * 通过继承来扩展接口
 */
public class HorrorShow {

    static void u(Monster b){
        b.menace();
    }

    static void v(DangerousMonster d){
        d.menace();
        d.destroy();
    }

    static void w(Lethal l){
        l.kill();
    }

    public static void main(String[] args){
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);

        //匿名初始化，直接实现接口，将派生类名隐藏。
        //实际上这是一个匿名内部类。一个匿名类继承了Vampire然后又上溯造型了。
        Vampire v2 = new Vampire() {
            public void drinkBlood() {

            }

            public void destroy() {

            }

            public void kill() {

            }

            public void menace() {

            }
        };

        u(v2);
        v(v2);
        w(v2);

    }
}
