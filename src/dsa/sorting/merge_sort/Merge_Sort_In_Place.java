package dsa.sorting.merge_sort;

import java.util.Arrays;

public class Merge_Sort_In_Place {
    static void main() {
        int[] arr = {5, 6, 7, 8, 4, 3, 2, 1, 0};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int start, int end) {
        if (end - start == 0)
            return;
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }
    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end)
            if (arr[i] <= arr[j])
                mix[k ++] = arr[i ++];
            else mix[k ++] = arr[j ++];
        while (i <= mid)
            mix[k ++] = arr[i ++];
        while (j <= end)
            mix[k ++] = arr[j ++];
        System.arraycopy(mix, 0, arr, start, mix.length);
    }
}
