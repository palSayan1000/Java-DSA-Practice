package dsa.recursion.level_7_backtracking;

public class Kunal_NQueen {
    static void main() {
        System.out.println("N-Queens: " + placeNQueens(new boolean[4][4], 0));
    }
    static int placeNQueens(boolean[][] board, int row) {
        if (row == board.length) {
            displayBoard(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int i = 0; i < board[0].length; i++)
            // Place the queen when it is safe
            if (isSafe(board, row, i)) {
                board[row][i] = true;
                count += placeNQueens(board, row + 1);
                board[row][i] = false;
            }
        return count;
    }
    static boolean isSafe(boolean[][] board, int row, int col) {
        // Checking up
        for (int i = 0; i < row; i++)
            if (board[i][col])
                return false;
        // Checking left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j])
                return false;
        // Checking right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j <= board.length - 1; i--, j++)
            if (board[i][j])
                return false;
        return true;
    }
    static void displayBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean col : row)
                if (col)
                    System.out.print("Q\t");
                else System.out.print(".\t");
            System.out.println();
        }
    }
}