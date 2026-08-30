package dsa.recursion.level_7_backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/n-queens/description/
public class N_Queens {
    static void main() {
        var list = solveNQueens(4);
        for (var row : list) {
            for (var col : row)
                System.out.println(col);
            System.out.println();
        }
    }
    static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] i: board)
            Arrays.fill(i, '.');
        List<List<String>> list = new ArrayList<>();
        solveNQueens(0, board, list);
        return list;
    }
    static void solveNQueens(int row, char[][] board, List<List<String>> list) {
        if (row == board.length) {
            List<String> lst = new ArrayList<>();
//            StringBuilder sb = new StringBuilder();
//            for (char[] rows: board) {
//                for (char col : rows)
//                    sb.append(col).append("\t");
//                lst.add(sb.toString());
//                sb.setLength(0);
//            }
            for (char[] i: board)
                lst.add(String.valueOf(i));
            //  lst.add(new String(i));
            list.add(lst);
        }
        for (int i = 0; i < board.length; i++)
            if (isSafeToPlace(board, row, i)) {
                board[row][i] = 'Q';
                solveNQueens(row + 1, board, list);
                board[row][i] = '.';
            }
    }
    static boolean isSafeToPlace(char[][] board, int row, int col) {
        // check up
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;
        // check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;
        // check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q') return false;
        return true;
    }
}
