package xno;

import xno.players.IPlayer;

/**
 *
 * @author Shubernetskii
 */
public class GameManager {

    private final IPlayer firstPlayer;
    private final IPlayer secondPlayer;
    private final Board board;

    /**
     * 
     * @return 
     */
    private String GetBoard() {
        return board.toString();
    }

    /**
     * 
     */
    private void InitGame() {
        System.out.println("start game");
        board.Clear();
    }

    /**
     * 
     * @param first
     * @param second 
     */
    public GameManager(IPlayer first, IPlayer second) {
        firstPlayer = first;
        secondPlayer = second;
        board = new Board();
    }

    /**
     * 
     */
    public void Play() {
        Boolean isFirst = true;
        InitGame();
        while (board.GetResult() == GameResult.NO_RESULT) {
            Move move;
            do {
                move = (isFirst) ? firstPlayer.GetMove(board) : secondPlayer.GetMove(board);
            } while (board.ValidateMove(move) == false);
            System.out.println("move: " + move);
            board.SetSign(move, isFirst);

            // extract to class Printer / ConsolePrinter / UIPrinter
            System.out.println(GetBoard());

            isFirst = !isFirst;
        }
        switch(board.GetResult()){
           case XWIN: System.out.println("X wins!"); break;
           case OWIN: System.out.println("O wins!"); break;
           case DRAW: System.out.println("Draw!"); break;
        }
    }
}
