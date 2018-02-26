package chapter07.case06;

/**
 * 代码复用的策略：代理
 */
public class SpaceShipDelegation {

    private String name;

    SpaceShipDelegation(String name){
        this.name = name;
    }

    private SpaceShipControls controls = new SpaceShipControls();

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void back(int velocity) {
        controls.back(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public static void main(String[] args){
        SpaceShipDelegation x = new SpaceShipDelegation("NSEA Protector");
        x.forward(100);
    }
}
