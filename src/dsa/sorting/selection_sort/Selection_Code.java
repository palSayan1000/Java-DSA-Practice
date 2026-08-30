package dsa.sorting.selection_sort;

public class Selection_Code {
    static void main() {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for(int i = 0; i < arr.length - 1; i ++) {
            // find the min item and swap with the correct index
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minPos]) minPos = j;
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] =temp;
        }
    }
}
