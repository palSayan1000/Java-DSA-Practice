package basic_understanding.arrays.methods;
import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * sort: Sorts the array into ascending order sequentially (using
         * Dual-Pivot Quicksort for primitives and TimSort for objects).
         *
         * parallelSort: Sorts the array into ascending order concurrently.
         * It breaks the array down into smaller sub-arrays, sorts them
         * simultaneously across multiple CPU threads, and merges them back.
         */
        int[] data1 = {9, 4, 6, 2, 1};
        int[] data2 = {100, 23, 88, 1, 45};

        // Standard sequential sort
        Arrays.sort(data1);
        System.out.println(Arrays.toString(data1)); // Prints: [1, 2, 4, 6, 9]

        // Parallel sort (use for arrays with thousands/millions of elements)
        Arrays.parallelSort(data2);
        System.out.println(Arrays.toString(data2)); // Prints: [1, 23, 45, 88, 100]
    }
}
