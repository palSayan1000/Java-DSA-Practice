package dsa.searching.linear;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main() {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18,  12}
        };
        int target = 34;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] arr, int target) {
        int row, col = 0;
         outer:
         for(row = 0; row < arr.length; row++)
             for(col = 0; col < arr[row].length; col++)
                 if(arr[row][col] == target)
                     break outer;
         return row == arr.length && col == arr[arr.length - 1].length ? new int[]{-1, -1} : new int[]{row, col};
    }
}
