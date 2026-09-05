package dsa.searching.binary;
// https://leetcode.com/problems/search-a-2d-matrix/description/
public class Search_2D_Matrix {
    static boolean searchMatrix(int[][] matrix, int target) {
        return rowSearch(matrix[colSearch(matrix, target)], target);
    }
    static int colSearch(int[][] matrix, int target) {
        int rStart = 0, rEnd = matrix.length - 1, eCol = matrix[0].length - 1;
        while (rStart < rEnd) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][eCol] < target)
                rStart = rMid + 1;
            else rEnd = rMid;
        }
        return rEnd;
    }
    static boolean rowSearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return true;
            if (arr[mid] < target)
                start = mid + 1;
            else if (arr[mid] > target)
                end = mid - 1;
        }
        return false;
    }
    static void main() {
        System.out.println(searchMatrix(new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        }, 2));
    }
}