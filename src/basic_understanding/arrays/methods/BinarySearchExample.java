package basic_understanding.arrays.methods;
import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * Searches for a specific value in a sorted array using the binary
         * search algorithm.
         * NOTE: The array *must* be sorted before calling this, otherwise
         * the results are undefined.
         */
        int[] numbers = {50, 10, 40, 20, 30};

        // 1. Must sort first!
        Arrays.sort(numbers); // Array is now: [10, 20, 30, 40, 50]

        // 2. Search for the number 40
        int index = Arrays.binarySearch(numbers, 40);

        System.out.println("Index of 40: " + index); // Prints: 3
    }
}
