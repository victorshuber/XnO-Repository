package xno.players;

import java.util.Random;
import xno.Board;
import xno.Move;

/**
 *
 * @author Shubernetskii
 */
public class ComputerPlayer implements IPlayer {

    /**
     * 
     * @param board
     * @return 
     */
    @Override
    public Move GetMove(Board board) {
        Random random = new Random();
        
        Move move = new Move();
        move.column = random.nextInt(3);
        move.row = random.nextInt(3);
        return move;
    }

}
