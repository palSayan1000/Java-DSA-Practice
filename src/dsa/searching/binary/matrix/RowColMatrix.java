package dsa.searching.binary.matrix;

/*
Matrix is row wise column wise sorted
 10 20 30 40
 15 25 35 45
 28 29 37 49
 33 34 38 50
 row getting from 0 to n - 1
 col getting from n - 1 to 0
 */
public class RowColMatrix {
    static void main() {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(java.util.Arrays.toString(search(matrix, 49)));
    }
    static int[] search (int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return new int[] {row, col};
            if (matrix[row][col] > target)
                col --;
            else row ++;
        }
        return new int[] {-1, -1};
    }
}
