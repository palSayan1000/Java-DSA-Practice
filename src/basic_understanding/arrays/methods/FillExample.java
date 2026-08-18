package basic_understanding.arrays.methods;
import java.util.Arrays;

public class FillExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * Overwrites every element in the array (or in the specified range)
         * with the provided value.
         */
        int[] scores = new int[5]; // currently [0, 0, 0, 0, 0]

        // Fill the entire array
        Arrays.fill(scores, 100);
        System.out.println(Arrays.toString(scores)); // Prints: [100, 100, 100, 100, 100]

        // Fill only a specific range (index 1 inclusive to 4 exclusive)
        Arrays.fill(scores, 1, 4, 50);
        System.out.println(Arrays.toString(scores)); // Prints: [100, 50, 50, 50, 100]
    }
}
