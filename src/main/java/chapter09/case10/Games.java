package chapter09.case10;

/**
 * case09的另一个例子
 */
public class Games {

    public static void playGame(final GameFactory gameFactory, final int playerCount) {

        // 在服务器中，每次添加一个请求，我们就会生成一个新线程，让一个新玩家参与游戏
        for (int i = 0; i < playerCount; i++) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    // 我们用工厂类可以为某个特定的游戏直接开局一场新游戏
                    Game player = gameFactory.getGame();
                    while (player.move()) ;
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory(), 3);
        playGame(new ChessFactory(), 5);
    }

}
