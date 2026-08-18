package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        // Create an initial list
        List<String> letters = new ArrayList<>(List.of("A", "B", "C", "D", "E"));

        // Extract a sublist from index 1 (inclusive) to 4 (exclusive)
        List<String> subLetters = letters.subList(1, 4);

        // Output will be: [B, C, D]
        System.out.println("Sublist: " + subLetters);
    }
}