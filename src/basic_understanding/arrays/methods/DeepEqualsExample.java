package basic_understanding.arrays.methods;
import java.util.Arrays;

public class DeepEqualsExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * Checks if two arrays are deeply equal. Unlike standard 'equals',
         * if the arrays contain *other arrays* (like a 2D array), this method
         * will recursively dive into those nested arrays to check if their
         * contents match.
         */
        Integer[][] matrix1 = {{1, 2}, {3, 4}};
        Integer[][] matrix2 = {{1, 2}, {3, 4}};

        // Standard equals fails because it only compares memory addresses of the inner arrays
        System.out.println(Arrays.equals(matrix1, matrix2));     // Prints: false

        // deepEquals dives in and checks the actual integer values
        System.out.println(Arrays.deepEquals(matrix1, matrix2)); // Prints: true
    }
}