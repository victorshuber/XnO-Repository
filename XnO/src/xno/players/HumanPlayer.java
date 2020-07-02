package xno.players;

import java.util.Scanner;
import xno.Board;
import xno.Move;

/**
 *
 * @author Shubernetskii
 */
public class HumanPlayer implements IPlayer {

    /**
     * 
     * @param board
     * @return 
     */
    @Override
    public Move GetMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X and Y (1..3):");
        
        Move move = new Move();
        move.column = scanner.nextInt() - 1;
        move.row = scanner.nextInt() - 1;
        return move;
    }

}
