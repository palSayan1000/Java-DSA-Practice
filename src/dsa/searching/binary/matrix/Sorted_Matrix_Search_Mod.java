package dsa.searching.binary.matrix;

public class Sorted_Matrix_Search_Mod {
    static void main() {
        System.out.println(java.util.Arrays.toString(search(new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        }, 2)));
    }
    static int[] search(int[][] matrix, int target) {
        int row = binarySearchCol(matrix, target), col = binarySearchRow(matrix[row], target);
        if (col == -1)
            return new int[]{-1, -1};
        return new int[]{row, col};
    }
    static int binarySearchCol(int[][] matrix, int target) {
        int lastCol = matrix[0].length - 1, rStart = 0, rEnd = matrix.length - 1;
        while (rStart < rEnd) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if (target == matrix[rMid][lastCol])
                return rMid;
            if (target < matrix[rMid][lastCol])
                rEnd = rMid;
            else rStart = rMid + 1;
        }
        return rStart;
    }
    static int binarySearchRow(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target)
                end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
