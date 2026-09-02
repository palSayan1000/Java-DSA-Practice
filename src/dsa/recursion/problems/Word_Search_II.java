package dsa.recursion.problems;

import java.util.ArrayList;
import java.util.List;

public class Word_Search_II {
    static void main() {
        char[][] board = {
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        };

        String[] words = {"oath", "pea", "eat", "rain"};

        System.out.println(findWords(board, words));
    }
    static List<String> findWords(char[][] board, String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                for (String word : words)
                    if (board[i][j] == word.charAt(0) && !list.contains(word) && findWords(board, word, 0, i, j))
                        list.add(word);
        return list;
    }
    static boolean findWords(char[][] board, String word, int index, int row, int col) {
        if (index == word.length())
            return true;
        if (row < 0 || col < 0 || col >= board[0].length || row >= board.length)
            return false;
        if (board[row][col] != word.charAt(index))
            return false;
        char temp = board[row][col];
        board[row][col] = '#';
        boolean ans = findWords(board, word, index + 1, row + 1, col) || findWords(board, word, index + 1, row - 1, col)
                || findWords(board, word, index + 1, row, col + 1) ||  findWords(board, word, index + 1, row, col - 1);
        board[row][col] = temp;
        return ans;
    }
}
