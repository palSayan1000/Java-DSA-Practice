package concepts.dsa.data_structures.matrix;

import java.util.Arrays;

// https://leetcode.com/problems/transpose-matrix/description/
public class Transpose_Matrix {
    static void main() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(new Transpose_Matrix().transpose(matrix)));
    }

    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] result = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
