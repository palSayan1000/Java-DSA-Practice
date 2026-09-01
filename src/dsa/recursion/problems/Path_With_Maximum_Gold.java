package dsa.recursion.problems;

public class Path_With_Maximum_Gold {
    static void main() {
        int[][] arr = {{1,0,7},{2,0,6},{3,4,5},{0,3,0},{9,0,20}};
        System.out.println(getMaximumGold(arr));
    }
    static int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                maxGold = j != 0 ? Math.max(maxGold, getMaximumGold(grid, i, j)) : maxGold;
        return maxGold;
    }
    static int getMaximumGold(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length)
            return 0;
        if (grid[row][col] == 0)
            return 0;
        int temp = grid[row][col];
        grid[row][col] = 0;
        int sum = temp + Math.max(getMaximumGold(grid, row + 1, col), Math.max(getMaximumGold(grid, row - 1, col), Math.max(getMaximumGold(grid, row, col + 1), getMaximumGold(grid, row, col - 1))));
        grid[row][col] = temp;
        return sum;
    }
}
