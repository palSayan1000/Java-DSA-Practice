package dsa.sorting.bubble_sort;

public class Code_Bubble {
    static void main() {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
        // run the steps n-1 times
        boolean swapped = true; // if no swap occured it will break
        for (int i = 0; i < arr.length - 1 && swapped; i ++) {
            // for each step, max item will come at the last respective index
            swapped = false;
            for (int j = 1; j < arr.length - i; j++)
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
        }
    }
}
