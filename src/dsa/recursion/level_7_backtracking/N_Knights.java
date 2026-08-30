package dsa.recursion.level_7_backtracking;

public class N_Knights {
    static void main() {
        knight(new boolean[4][4], 0, 0, 8);
    }
    static void knight(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            displayBoard(board);
            return;
        }
        if (row == board.length - 1 && col == board.length)
            return;
        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        knight(board, row, col + 1, knights);
    }
    static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1) && board[row - 2][col - 1]) return false;
        if (isValid(board, row - 2, col + 1) && board[row - 2][col + 1]) return false;
        if (isValid(board, row - 1, col + 2) && board[row - 1][col + 2]) return false;
        if (isValid(board, row - 1, col - 2) && board[row - 1][col - 2]) return false;
        if (isValid(board, row + 2, col + 1) && board[row + 2][col + 1]) return false;
        if (isValid(board, row + 2, col - 1) && board[row + 2][col - 1]) return false;
        if (isValid(board, row + 1, col + 2) && board[row + 1][col + 2]) return false;
        if (isValid(board, row + 1, col - 2) && board[row + 1][col - 2]) return false;
        return true;
    }
    // do not repeat yourself hence created this func
    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }
    static void displayBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean col : row)
                System.out.print(col ? "K\t" : "_\t");
            System.out.println();
        }
        System.out.println();
    }
}
