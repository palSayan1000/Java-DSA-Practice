package basic_understanding.arrays.methods;
import java.util.Arrays;

public class CopyOfRangeExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * Copies a specific subset of the original array into a brand new array,
         * based on the 'from' (inclusive) and 'to' (exclusive) indices provided.
         */
        char[] letters = {'A', 'B', 'C', 'D', 'E'};

        // Copy from index 1 (inclusive) up to index 4 (exclusive)
        char[] subset = Arrays.copyOfRange(letters, 1, 4);

        System.out.println(Arrays.toString(subset)); // Prints: [B, C, D]
    }
}
