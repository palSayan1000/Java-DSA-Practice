package basic_understanding.arrays.methods;

import java.util.Arrays;
import java.util.Random;

public class ParallelSortExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * parallelSort: Sorts the array into ascending order concurrently.
         * Behind the scenes, it uses Java's Fork/Join framework. It breaks the
         * array down into smaller sub-arrays, sorts them simultaneously across
         * multiple CPU threads, and then merges them back together.
         *
         * PRO TIP: For small arrays (usually under 8,192 elements), it automatically
         * falls back to a standard sequential sort. Its real power is unleashed
         * when sorting massive datasets.
         */

        // Let's create a large array of 100,000 elements to simulate a real use case
        int[] massiveArray = new int[100000];
        Random rand = new Random();

        // Fill it with random numbers
        for (int i = 0; i < massiveArray.length; i++) {
            massiveArray[i] = rand.nextInt(1000000);
        }

        // Sort the massive array using multiple threads for a speed boost
        Arrays.parallelSort(massiveArray);

        // Print the first 5 elements to verify it sorted correctly
        System.out.println("First 5 sorted elements:");
        for (int i = 0; i < 5; i++) {
            System.out.print(massiveArray[i] + " ");
        }
    }
}
