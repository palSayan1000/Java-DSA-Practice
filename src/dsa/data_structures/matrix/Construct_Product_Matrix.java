package dsa.data_structures.matrix;

import java.util.Arrays;

// https://leetcode.com/problems/construct-product-matrix/description/
public class Construct_Product_Matrix {
    static void main() {
        int[][] grid = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(grid));
        System.out.println(Arrays.deepToString(new Construct_Product_Matrix().constructProductMatrix(grid)));
    }

    public int[][] constructProductMatrix(int[][] grid) {
        final int MOD = 12345,
                m = grid.length, n = grid[0].length;
        int[][] product = new int[grid.length][grid[0].length];
        long suffix = 1, prefix = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                product[i][j] = (int) (prefix % MOD);
                prefix = prefix * grid[i][j] % MOD;
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                product[i][j] = (int) (product[i][j] * suffix % MOD);
                suffix = suffix * grid[i][j] % MOD;
            }
        }

        return product;
    }
}
