package basic_understanding.arrays.methods;

import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * Creates a new array by copying the original. If newLength is larger
         * than the original, it pads the extra space with default values (like
         * 0 for ints, or null for Objects). If smaller, it truncates the copy.
         */
        int[] original = {1, 2, 3};

        // Pad with default values (0)
        int[] largerCopy = Arrays.copyOf(original, 5);
        System.out.println(Arrays.toString(largerCopy)); // Prints: [1, 2, 3, 0, 0]

        // Truncate the array
        int[] smallerCopy = Arrays.copyOf(original, 2);
        System.out.println(Arrays.toString(smallerCopy)); // Prints: [1, 2]
    }
}