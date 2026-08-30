package dsa.recursion.level_7_backtracking;

import java.util.Arrays;

public class Backtracking_UDRL {
    static void main() {
        boolean[][] board = new boolean[3][3];
        // allPaths_UDLR("", board, 0, 0);
        allPathsPrint("", board, 0, 0, new int[board.length][board[0].length], 1);
    }
    static void allPaths_UDLR(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (maze[r][c])  // already visited this cell, don't revisit
            return;
        // I am considering this block is in my path
        maze[r][c] = true;
        if (r < maze.length - 1) {
            allPaths_UDLR(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPaths_UDLR(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            allPaths_UDLR(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allPaths_UDLR(p + 'L', maze, r, c - 1);
        }
        // but when i am getting out from here i am restoring it
        // this line is where the function will be over
        // so before the fucntion gets removed, also remove the changes that were made by that function
        maze[r][c] = false;
    }
    static void allPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] i: path)
                System.out.println(Arrays.toString(i));
            System.out.println(p + "\n");
            return;
        }
        if (maze[r][c])  // already visited this cell, don't revisit
            return;
        // I am considering this block is in my path
        maze[r][c] = true;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathsPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            allPathsPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            allPathsPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            allPathsPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }
        // but when i am getting out from here i am restoring it
        // this line is where the function will be over
        // so before the fucntion gets removed, also remove the changes that were made by that function
        maze[r][c] = false;
        path[r][c] = 0;
    }
}
