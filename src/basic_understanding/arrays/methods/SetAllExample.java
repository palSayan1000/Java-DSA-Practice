package basic_understanding.arrays.methods;
import java.util.Arrays;

public class SetAllExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * Modifies all elements of an array using a generator function.
         * The function is passed the *index* of the element, and it returns
         * the value that should be placed at that index.
         *
         * parallelSetAll does this concurrently (good for massive arrays),
         * setAll does this sequentially on a single thread.
         */
        int[] evens = new int[5];

        // The lambda 'i -> i * 2' takes the index 'i' and multiplies it by 2
        Arrays.setAll(evens, i -> i * 2);
        System.out.println(Arrays.toString(evens)); // Prints: [0, 2, 4, 6, 8]

        // Same exact logic, but processed in parallel
        double[] roots = new double[4];
        Arrays.parallelSetAll(roots, i -> Math.sqrt(i));
        System.out.println(Arrays.toString(roots)); // Prints: [0.0, 1.0, 1.414..., 1.732...]
    }
}