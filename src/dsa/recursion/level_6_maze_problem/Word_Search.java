package dsa.recursion.level_6_maze_problem;

public class Word_Search {
    static void main() {
        String word = "ABCCED";
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(new Word_Search().exist(board, word));
    }
    boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (word.charAt(0) == board[i][j] && exist(board, word, 0, i, j))
                    return true;
        return false;
    }
    boolean exist(char[][] board, String word, int index, int row, int col) {
        if (index == word.length())
            return true;
        if (!(row >= 0 && col >= 0 && row < board.length && col < board[0].length) || word.charAt(index) != board[row][col])
            return false;
        char temp = word.charAt(index);
        board[row][col] = '#';
        boolean exist = exist(board, word, index + 1, row - 1, col) ||
                        exist(board, word, index + 1, row + 1, col) ||
                exist(board, word, index + 1, row, col - 1) ||
                exist(board, word, index + 1, row, col + 1);
        board[row][col] = temp;
        return exist;
    }
}
