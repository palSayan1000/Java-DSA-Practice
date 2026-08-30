package dsa.sorting.quick_sort;

import java.util.Arrays;

public class Quick_Sort {
    static void main() {
        int[] arr = {5, 4, 3, 2, 1, 0};
        quickSort(arr, 0, arr.length - 1);
        // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int start = low, end = high, mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while (start <= end) {
            // also a reason why if its already sorted it will not swap
            while (arr[start] < pivot)
                start ++;
            while (arr[end] > pivot)
                end --;
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start ++;
                end --;
            }
        }
        // now my pivot is at the correct index, please sort two halves now
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
