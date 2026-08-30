package dsa.recursion.level_3_patterns_and_basic_sort;

public class Bubble_Sort {
    static void main() {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, 0);
        System.out.println(java.util.Arrays.toString(arr));
    }
    static void sort(int[] arr, int i, int j) {
        if (i == arr.length - 1)
            return;
        if (j == arr.length - 1 - i) {
            sort(arr, i + 1, 0);
            return;
        }
        if (arr[j + 1] < arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
        sort(arr, i, j + 1);
//        if (j == 0)
//            sort(arr, i + 1, j);
    }
}
