package basic_understanding.arrays.methods;

import java.util.Arrays;

public class ParallelPrefixExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * Cumulates each element in place using a function, processing it
         * in parallel. For example, if you pass an addition operator, the
         * array [2, 1, 0, 3] becomes [2, 3, 3, 6] (a running total).
         */
        int[] values = {2, 1, 0, 3};

        // (x, y) -> x + y adds the previous cumulative result (x) to the current element (y)
        Arrays.parallelPrefix(values, (x, y) -> x + y);

        System.out.println(Arrays.toString(values)); // Prints: [2, 3, 3, 6]
    }
}
