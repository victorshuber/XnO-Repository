package xno;

/**
 *
 * @author Shubernetskii
 */
public class Board {

    private String[][] brd = {
        {" ", " ", " "},
        {" ", " ", " "},
        {" ", " ", " "}
    };

    public Board() {

    }

    /**
     * 
     * @param move
     * @param isFirst 
     */
    public void SetSign(Move move, Boolean isFirst) {
        brd[move.column][move.row] = (isFirst) ? "X" : "O";
    }

    /**
     * 
     * @return 
     */
    public GameResult GetResult() {
        for (int i = 0; i < 3; i++) {
            if ("X".equals(brd[i][0]) && "X".equals(brd[i][1]) && "X".equals(brd[i][2])) {
                return GameResult.XWIN;
            }
            if ("X".equals(brd[0][i]) && "X".equals(brd[1][i]) && "X".equals(brd[2][i])) {
                return GameResult.XWIN;
            }
        }
        if ("X".equals(brd[0][0]) && "X".equals(brd[1][1]) && "X".equals(brd[2][2])) {
            return GameResult.XWIN;
        }
        if ("X".equals(brd[0][2]) && "X".equals(brd[1][1]) && "X".equals(brd[2][0])) {
            return GameResult.XWIN;
        }

        for (int i = 0; i < 3; i++) {
            if ("O".equals(brd[i][0]) && "O".equals(brd[i][1]) && "O".equals(brd[i][2])) {
                return GameResult.OWIN;
            }
            if ("O".equals(brd[0][i]) && "O".equals(brd[1][i]) && "O".equals(brd[2][i])) {
                return GameResult.OWIN;
            }
        }
        if ("O".equals(brd[0][0]) && "O".equals(brd[1][1]) && "O".equals(brd[2][2])) {
            return GameResult.OWIN;
        }
        if ("O".equals(brd[0][2]) && "O".equals(brd[1][1]) && "O".equals(brd[2][0])) {
            return GameResult.OWIN;
        }

        for (int col = 0; col < 3; ++col) {
            for (int row = 0; row < 3; ++row) {
                if(" ".equals(brd[col][row]))
                return GameResult.NO_RESULT;
            }
        }
        return GameResult.DRAW;
    }

    @Override
    public String toString() {
        String result = "";
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                result += brd[col][row];
            }
            result += "\n";
        }

        return result;
    }

    /**
     * 
     */
    void Clear() {
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                brd[col][row] = " ";
            }
        }
    }

    /**
     * 
     * @param move
     * @return 
     */
    public boolean ValidateMove(Move move) {
        return " ".equals(brd[move.column][move.row]);
    }
}
