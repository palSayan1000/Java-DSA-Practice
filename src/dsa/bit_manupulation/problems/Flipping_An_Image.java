package dsa.bit_manupulation.problems;

import java.util.Arrays;

public class Flipping_An_Image {
    static void main() {
        int[][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Flipped Arr: " + Arrays.deepToString(flipAndInvertImage(arr)));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] arr: image)
            for (int i = 0; i < (arr.length + 1) / 2; i++) {
                int temp = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = arr[i] ^ 1;
                arr[i] = temp ^ 1;
            }
        return image;
    }
}
