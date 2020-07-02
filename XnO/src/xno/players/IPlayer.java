package xno.players;

import xno.Board;
import xno.Move;

/**
 *
 * @author Shubernetskii
 */
public interface IPlayer {
    /**
     * 
     * @param board
     * @return 
     */
    Move GetMove(Board board);
}
