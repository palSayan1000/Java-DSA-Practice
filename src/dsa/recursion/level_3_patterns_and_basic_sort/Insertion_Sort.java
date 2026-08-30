package dsa.recursion.level_3_patterns_and_basic_sort;

public class Insertion_Sort {
    static void main() {
        int[] arr = {4, 5, 9, 2, 1, 0};
        insertion(arr, 1, 1);
        System.out.println(java.util.Arrays.toString(arr));
    }
    static void insertion(int[] arr, int i, int j) {
        if (i == arr.length) return;
        if (j == 0 || arr[j - 1] < arr[j]) {
            insertion(arr, i + 1, i + 1);
            return;
        }
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        insertion(arr, i, j - 1);
//        insertion(arr, i + 1, i + 1);
    }
}
