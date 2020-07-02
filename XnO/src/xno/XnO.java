package xno;

import xno.players.ComputerPlayer;
import xno.players.HumanPlayer;

/**
 *
 * @author Shubernetskii
 */
public class XnO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //var first = new HumanPlayer();
        //var second = new HumanPlayer();
        var first = new ComputerPlayer();
        var second = new ComputerPlayer();
        var gameManager = new GameManager(first, second);
        gameManager.Play();
    }
    
}
