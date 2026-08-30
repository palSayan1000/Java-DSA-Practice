package dsa.recursion.level_6_maze_problem;

import java.util.Arrays;

// https://leetcode.com/problems/unique-paths/description/
public class Unique_Paths {
    static void main() {
        System.out.println(uniquePaths(3, 3));
    }
    // Using DP
    static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] i: dp)
            Arrays.fill(i, -1);
        return uniquePaths(0, 0, dp);
    }
    /// My one
    static int uniquePaths(int i, int j, int[][] dp) {
        if (i == dp.length - 1 && j == dp[0].length - 1)
            return 1;
        if (i >= dp.length || j >= dp[0].length)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        return dp[i][j] = uniquePaths(i + 1, j, dp) + uniquePaths(i, j + 1, dp);
    }
    /// Kunal's one
    static int countPaths(int row, int col) {
        if (row == 1 || col == 1)
            return 1;
        int left = countPaths(row - 1, col);
        int right = countPaths(row, col - 1);

        return left + right;
    }
}
