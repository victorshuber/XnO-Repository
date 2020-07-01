import java.util.Random;
import java.util.Scanner;
 
class BackEnd {
    final char SIGN_X = 'X';
    final char SIGN_O = 'O';
    final char SIGN_EMPTY = ' ';
    char[][] table;
    Random random;
    Scanner scanner;
 
    public static void main(String[] args) {
        new BackEnd().game();
    }
 
    BackEnd() {
        // конструктор: инициализация полей
    	random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }
 
    void game() {
        // игровая логика
    	 initTable();
    	    while (true) {
    	        turnHuman();
    	        if (checkWin(SIGN_X)) {
    	            System.out.println("YOU WIN!");
    	            break;
    	        }
    	        if (isTableFull()) {
    	            System.out.println("Sorry, DRAW!");
    	            break;
    	        }
    	        turnAI();
    	        printTable();
    	        if (checkWin(SIGN_O)) {
    	            System.out.println("AI WIN!");
    	            break;
    	        }
    	        if (isTableFull()) {
    	            System.out.println("Sorry, DRAW!");
    	            break;
    	        }
    	    }
    	    System.out.println("GAME OVER.");
    	    printTable();
    	}
   
 
    // дополнительные методы
void initTable() {
    for (int row = 0; row < 3; row++)
        for (int col = 0; col < 3; col++)
            table[row][col] = SIGN_EMPTY;
}

void printTable() {
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 3; col++)
            System.out.print(table[row][col] + " ");
        System.out.println();
    }
}

void turnHuman() {
    int x, y;
    do {
        System.out.println("Enter X and Y (1..3):");
        x = scanner.nextInt() - 1;
        y = scanner.nextInt() - 1;
    } while (!isCellValid(x, y));
    table[y][x] = SIGN_X;
}

boolean isCellValid(int x, int y) {
    if (x < 0 || y < 0 || x >= 3|| y >= 3)
        return false;
    return table[y][x] == SIGN_EMPTY;
}

void turnAI() {
    int x, y;
    do {
        x = random.nextInt(3);
        y = random.nextInt(3);
    } while (!isCellValid(x, y));
    table[y][x] = SIGN_O;
}

boolean checkWin(char space) {
    for (int i = 0; i < 3; i++)
        if ((table[i][0] == space && table[i][1] == space &&
                         table[i][2] == space) ||
                (table[0][i] == space && table[1][i] == space &&
                                  table[2][i] == space))
            return true;
        if ((table[0][0] == space && table[1][1] == space &&
                  table[2][2] == space) ||
                    (table[2][0] == space && table[1][1] == space &&
                      table[0][2] == space))
            return true;
    return false;
}

boolean isTableFull() {
    for (int row = 0; row < 3; row++)
        for (int col = 0; col < 3; col++)
            if (table[row][col] == SIGN_EMPTY)
                return false;
    return true;
}
}