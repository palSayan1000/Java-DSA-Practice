package basic_understanding.arrays.methods;
import java.util.Arrays;

public class StreamExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * Converts the array into a Java 8 Stream, allowing you to use
         * functional programming operations like .filter(), .map(),
         * and .reduce() on the data.
         */
        int[] numbers = {1, 2, 3, 4, 5};

        // Convert to stream, filter for even numbers, and sum them up
        int sumOfEvens = Arrays.stream(numbers)
                               .filter(n -> n % 2 == 0)
                               .sum();

        System.out.println("Sum of evens: " + sumOfEvens); // Prints: 6
    }
}