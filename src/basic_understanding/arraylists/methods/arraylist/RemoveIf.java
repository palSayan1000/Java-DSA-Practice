package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        // Create an ArrayList (must be mutable)
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        // Remove all even numbers
        numbers.removeIf(n -> n % 2 == 0);

        System.out.println(numbers);
        // Output: [1, 3, 5]
    }
}