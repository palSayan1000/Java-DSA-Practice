package dsa.sorting.insertion_sort;

public class Insertion_Code {
    static void main() {
        int[] arr = {5, 4, 3, 2, 1};
        insertion(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--)
                if (arr[j - 1] > arr[j])
                    swap (arr, j - 1, j);
                else break;
        }
    }
    static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
