package basic_understanding.arrays.methods;
import java.util.Arrays;
import java.util.List;

public class AsListExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * Takes an array (or a comma-separated list of elements) and returns
         * a fixed-size List backed by that array. Changes to the returned list
         * "write through" to the original array, and vice versa.
         */
        String[] wordsArray = {"Apple", "Banana", "Cherry"};
        List<String> wordsList = Arrays.asList(wordsArray);

        // Modifying the list modifies the original array!
        wordsList.set(0, "Apricot");

        System.out.println(Arrays.toString(wordsArray)); // Prints: [Apricot, Banana, Cherry]
    }
}