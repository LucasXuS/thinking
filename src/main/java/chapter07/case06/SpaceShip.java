package chapter07.case06;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 利用继承来实现太空船类
 */
public class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip x = new SpaceShip("NSEA Protector");
        x.forward(100);
    }
    /**
     *
     * 重新思考 继承 和 组合，我们可以发现：
     * 继承是一个 is-a 的关系
     * 组合是一个 has-a 的关系
     * SpaceShip 与 SpaceShipControls 是一个has-a的关系，因此不宜用继承
     * 但是我们需要“告诉”SpaceShip 前进或者后退，
     * 即，我们需要SpaceControls的方法都在SpaceShip中暴露出来
     * 因此我们需要代理关系
     *
     * */

}