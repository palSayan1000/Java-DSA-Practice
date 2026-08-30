package dsa.sorting.insertion_sort;

import static java.lang.IO.println;

public class Code_Insertion {
    static void main() {
        int[] arr = {5, 4, 4, 3, 2, 1, -1, 0};
        sort(arr);
        println(java.util.Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1, temp = arr[i];
            while (j >= 0 && arr[j] > temp)
                arr[j + 1] = arr[j -- /* decrementing j */];
            arr[j + 1] = temp;
        }
    }
}
