package xno;


/**
 *
 * @author Shubernetskii
 */
public class Move {
    public int column;
    public int row;
    
    @Override
    public String toString(){
        return "{ " + column + ", " + row +" }";
    }
}
