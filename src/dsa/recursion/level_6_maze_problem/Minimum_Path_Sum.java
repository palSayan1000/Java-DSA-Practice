package dsa.recursion.level_6_maze_problem;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-path-sum/description/
public class Minimum_Path_Sum {
    static void main() {
        System.out.println(minPathSum(new int[][] {{1,2,3},{4,5,6}}));
    }
    static int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] i: dp)
            Arrays.fill(i, -1);
        dp[grid.length - 1][grid[0].length - 1] = grid[grid.length - 1][grid[0].length - 1];
        return getMinimumPathSum(0, 0, grid, dp);
    }
    static int getMinimumPathSum(int i, int j, int[][] grid, int[][] dp) {
        if (dp[i][j] != -1 || (i == grid.length - 1 && j == grid[0].length - 1))
            return dp[i][j];
        int min = Integer.MAX_VALUE;
        if (i < grid.length - 1)
            min = Math.min(min, getMinimumPathSum(i + 1, j, grid, dp));
        if (j < grid[0].length - 1)
            min = Math.min(min, getMinimumPathSum(i, j + 1, grid, dp));
        return dp[i][j] = min + grid[i][j];
    }
}
