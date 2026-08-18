package basic_understanding.arrays.methods;
import java.util.Arrays;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * Returns a special iterator designed to easily partition the array
         * so it can be safely and efficiently processed by multiple threads
         * in a Stream.
         */
        String[] names = {"Alice", "Bob", "Charlie"};

        Spliterator<String> spliterator = Arrays.spliterator(names);

        // Iterates through the remaining elements
        spliterator.forEachRemaining(name -> System.out.println("Hello " + name));
    }
}