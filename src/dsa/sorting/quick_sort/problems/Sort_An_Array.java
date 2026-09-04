package dsa.sorting.quick_sort.problems;

import java.util.Arrays;

public class Sort_An_Array {
    static void main() {
        Sort_An_Array obj = new Sort_An_Array();
        int[] arr = {5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(obj.sortArray(arr)));
    }
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    public void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int low = start, high = end, mid = low + (high - low) / 2, pivot = arr[mid];
        while(low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            int temp = arr[low];
            arr[low ++] = arr[high];
            arr[high --] = temp;
        }
        quickSort(arr, start, high);
        quickSort(arr, low, end);
    }
}