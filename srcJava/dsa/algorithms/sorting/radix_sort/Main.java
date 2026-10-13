package dsa.algorithms.sorting.radix_sort;

import java.util.Arrays;

public class Main {
    static void main() {
        int[] arr = {29, 83, 471, 36, 91, 8};

        System.out.println("Original Array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted Updated Array: " + Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);

        // do count sort for every digit place
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    public static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        Arrays.fill(count, 0);

        for (int j : arr) {
            count[j / exp % 10]++;
        }

        // System.out.println("Count Array For : " + exp + " : " + Arrays.toString(count));

        for (int i = 1; i < 10; i++) {
            count[i] = count[i - 1] + count[i];
        }

        // System.out.println("Updated Count Array : " + Arrays.toString(count));

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] / exp % 10] - 1] = arr[i];
            count[arr[i] / exp % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
        // System.out.println(Arrays.toString(arr));
    }
}
