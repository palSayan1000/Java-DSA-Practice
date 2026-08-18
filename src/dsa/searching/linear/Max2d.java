package dsa.searching.linear;

import java.util.Arrays;

public class Max2d {
    static void main() {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        System.out.println(max(arr));
    }
    public static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int[] i: arr)
            for(int j: i)
                max = Math.max(max, j);
        return max;
    }
}
