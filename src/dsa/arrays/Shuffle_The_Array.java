package dsa.arrays;

import java.util.Arrays;

public class Shuffle_The_Array {
    public static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the no.of elements of the array: ");
        int n = sc.nextInt(), arr[] = new int[n];
        System.out.println("Enter the elements  of the array:" );
        for(int i = 0; i < n; arr[i++] = sc.nextInt());
        int[] shuffledArray = new Shuffle_The_Array().new Solution().shuffle(arr, n/2);
        System.out.println("Tthe shuffled array is: " + Arrays.toString(shuffledArray));
    }

    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] arr = new int[n * 2];
            for (int i = 0, k = 0; i < n; arr[k++] = nums[i], arr[k++] = nums[i++ + n]) ;
            return arr;
        }
    }
}