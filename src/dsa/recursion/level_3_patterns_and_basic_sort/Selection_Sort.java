package dsa.recursion.level_3_patterns_and_basic_sort;

public class Selection_Sort {
    static void main() {
        int[] arr = {5, 4, 3, 2, 1};
//        sort(arr, 0, 0);
        selection(arr, arr.length, 0,0);
        System.out.println(java.util.Arrays.toString(arr));
    }
    // My one
    static int sort(int[] arr, int i, int j) {
        if (i == arr.length - 1 || j == arr.length - 1)
            return j;
        int minPos = sort(arr, i, j + 1);
        if (arr[minPos] > arr[j]) minPos = j;
        if (j > i) return minPos;
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
        return sort(arr, i + 1, i + 1);
    }
    // Kunal's one
    static void selection(int[] arr, int i, int j, int max) {
        if (i == 0) return;
        if (j < i)
            selection(arr, i, j + 1, arr[j] > arr[max] ? j : max);
        else {
            int temp = arr[max];
            arr[max] = arr[i - 1];
            arr[i - 1] = temp;
            selection(arr, i - 1, 0, 0);
        }
    }
}
