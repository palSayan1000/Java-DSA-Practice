package dsa.searching.binary.matrix;

/*
    Search in a fully sorted matrix:

        1   2   3   4
        5   6   7   8
        9   10  11  12
        13  14  15  16

    Every row is sorted, and the first element of each row
    is greater than the last element of the previous row.
*/
public class Sorted_Matrix_Search {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(java.util.Arrays.toString(search(matrix, 2)));
    }

    static int[] search(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 ||
                matrix[0] == null || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // If there is only one row, search directly in that row.
        if (rows == 1) {
            return binarySearch(matrix, target, 0, 0, cols - 1);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        /*
            Continue until only two rows remain.
        */
        while (rStart < rEnd - 1) {
            int rMid = rStart + (rEnd - rStart) / 2;

            if (matrix[rMid][cMid] == target) {
                return new int[]{rMid, cMid};
            }

            if (matrix[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
        }

        /*
            Now only two rows remain:
            rStart and rStart + 1.
        */

        // Check the middle column of both rows.
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }

        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        /*
            Search in one of the four possible regions.
        */

        // First half of the first row.
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, target, rStart, 0, cMid - 1);
        }

        // Second half of the first row.
        if (target >= matrix[rStart][cMid + 1]
                && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, target, rStart, cMid + 1, cols - 1);
        }

        // First half of the second row.
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, target, rStart + 1, 0, cMid - 1);
        }

        // Second half of the second row.
        return binarySearch(
                matrix,
                target,
                rStart + 1,
                cMid + 1,
                cols - 1
        );
    }

    static int[] binarySearch(
            int[][] matrix,
            int target,
            int row,
            int cStart,
            int cEnd
    ) {
        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][cMid] == target) {
                return new int[]{row, cMid};
            }

            if (matrix[row][cMid] < target) {
                cStart = cMid + 1;
            } else {
                cEnd = cMid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}