package chapter09.case10;

/**
 * Created by lenovo on 2018/3/5.
 */
public class ChessFactory implements GameFactory{

    public Game getGame() {
        return new Chess();
    }
}
