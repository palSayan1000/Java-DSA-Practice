package dsa.recursion.level_7_backtracking;

// https://leetcode.com/problems/n-queens-ii/description/
public class N_Queens_II {
    static void main() {
        System.out.println("N Queens II: " + totalNQueens(4));
    }
    static int totalNQueens(int n) {
        return totalNQueens(new boolean[n][n], 0);
    }
    static int totalNQueens(boolean[][] board, int row) {
        if (row == board.length) return 1;
        int count = 0;
        for (int i = 0; i < board.length; i++)
            if (isSafe(board, row, i)) {
                board[row][i] = true;
                count += totalNQueens(board, row + 1);
                board[row][i] = false;
            }
        return count;
    }
    static boolean isSafe(boolean[][] board, int row, int col) {
        // Vertical check
        for (int i = 0; i < row; i ++)
            if (board[i][col]) return false;
        // Left diagonal check
        for (int i = 1; i <= Math.min(row, col); i++)
            if (board[row - i][col - i]) return false;
        // Right diagonal check
        for (int i = row - 1, j = col + 1; i >= 0 && j <= board.length - 1; i--, j++)
            if (board[i][j]) return false;
        return true;
    }
}