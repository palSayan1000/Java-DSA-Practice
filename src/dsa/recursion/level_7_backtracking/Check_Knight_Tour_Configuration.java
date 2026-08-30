package dsa.recursion.level_7_backtracking;
// https://leetcode.com/problems/check-knight-tour-configuration/description/
public class Check_Knight_Tour_Configuration {
    static boolean checkValidGrid(int[][] grid) {
        // n * n - 1 -> total steps that should be there (as 0 is included so 25 num excluded total = n * n)
        if (grid[0][0] != 0)
            return false;
        return grid.length * grid.length - 1 == checkValidGrid(grid, 0, 0, 0);
    }
    static int checkValidGrid(int[][] grid, int row, int col, int stepCount) {
        if (stepCount == grid.length * grid.length - 1)
            return stepCount;

        int[] nextStep = nextStep(grid, row, col, stepCount);
        if (nextStep == null)
            return stepCount;

        return checkValidGrid(grid, nextStep[0], nextStep[1], stepCount + 1);
    }
    static int[] nextStep(int[][] grid, int row, int col, int stepCount) {
        if (isValid(grid, row - 2, col - 1) && grid[row - 2][col - 1] == stepCount + 1)
            return new int[] {row - 2, col - 1};

        if (isValid(grid, row - 2, col + 1) && grid[row - 2][col + 1] == stepCount + 1)
            return new int[] {row - 2, col + 1};

        if (isValid(grid, row - 1, col + 2) && grid[row - 1][col + 2] == stepCount + 1)
            return new int[] {row - 1, col + 2};

        if (isValid(grid, row - 1, col - 2) && grid[row - 1][col - 2] == stepCount + 1)
            return new int[] {row - 1, col - 2};

        if (isValid(grid, row + 2, col + 1) && grid[row + 2][col + 1] == stepCount + 1)
            return new int[] {row + 2, col + 1};

        if (isValid(grid, row + 2, col - 1) && grid[row + 2][col - 1] == stepCount + 1)
            return new int[] {row + 2, col - 1};

        if (isValid(grid, row + 1, col + 2) && grid[row + 1][col + 2] == stepCount + 1)
            return new int[] {row + 1, col + 2};

        if (isValid(grid, row + 1, col - 2) && grid[row + 1][col - 2] == stepCount + 1)
            return new int[] {row + 1, col - 2};

        return null;
    }
    static boolean isValid(int[][] grid, int row, int col) {
        return row >= 0 && row < grid.length && col >= 0 && col < grid.length;
    }
}