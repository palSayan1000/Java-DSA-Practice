package dsa.sorting.merge_sort;

import java.util.Arrays;

public class MergeSort {
    static void main() {
        int[] arr = {5, 6, 7, 8, 4, 3, 2, 1, 0};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        // this is creating new objects every time
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        // it returned new array where the elements are sorted

        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j])
                mix[k ++] = first[i ++];
            else
                mix[k ++] = second[j ++];
        }
        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        // in this two loops only one will execute
        while (i < first.length) {
            mix[k ++] = first[i ++];
        }
        while (j < second.length) {
            mix[k ++] = second[j ++];
        }

        return mix;
    }
}