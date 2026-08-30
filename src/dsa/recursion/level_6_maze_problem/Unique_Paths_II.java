package dsa.recursion.level_6_maze_problem;

import java.util.Arrays;
// https://leetcode.com/problems/unique-paths-ii/
public class Unique_Paths_II {
    static void main() {
        System.out.println("Total Unique Paths: " + uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }
    /// My one using DP
    static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int[] i: dp)
            Arrays.fill(i, -1);
        return uniquePathsWithObstacles(0, 0, obstacleGrid, dp);
    }
    static int uniquePathsWithObstacles(int i, int j, int[][] obstacleGrid, int[][] dp) {
        if (i >= dp.length || j >= dp[0].length || obstacleGrid[i][j] == 1)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (i == dp.length - 1 && j == dp[0].length - 1)
            return 1;
        return dp[i][j] = uniquePathsWithObstacles(i + 1, j, obstacleGrid, dp) + uniquePathsWithObstacles(i, j + 1, obstacleGrid, dp);
    }
    /// Kunal's one // c and r starting from 0
    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c])
            return;
        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }
}
