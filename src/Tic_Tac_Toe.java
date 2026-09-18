import java.util.Scanner;

public class Tic_Tac_Toe {
    static void main() {
        char[][] board = new char[3][3];

        // initializing all places as empty
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ' ';
            }
        }

        var player = 'X';
        var gameOver = false;
        var sc = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + "enter: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveOwn(board, player);
                if (gameOver) {
                    System.out.println("Player " + player + " has own.");
                } else {
                    player = player == 'X' ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid Move. Try Again...");
            }
        }

        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar + " | ");
            }
            System.out.println();
        }
    }

    public static boolean haveOwn(char[][] board, char player) {
        // checks the rows -->
        for (char[] chars : board) {
            if (chars[0] == player && chars[1] == player && chars[2] == player) {
                return true;
            }
        }
        // checks for the cols -->
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        // check for the diagonal -->
        boolean f = true, f1 = true;
        for (int i = 0; i < board.length; i++) {
            f = f && board[i][i] == player;
            f1 = f1 && board[i][board.length - 1 - i] == player;
        }
        return f || f1;
    }
}
