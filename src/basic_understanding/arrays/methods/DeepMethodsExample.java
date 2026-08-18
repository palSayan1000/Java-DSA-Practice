package basic_understanding.arrays.methods;
import java.util.Arrays;

public class DeepMethodsExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * deepHashCode: Generates a hash code based on the deep contents of the
         * array, properly handling nested multidimensional arrays.
         *
         * deepToString: Returns a string representation of the array. If the
         * array contains nested arrays, it will safely convert those nested
         * arrays to strings as well.
         */
        String[][] board = {{"X", "O"}, {"O", "X"}};

        int hash = Arrays.deepHashCode(board);
        System.out.println("Hash code: " + hash);

        // deepToString prints the matrix clearly
        String visual = Arrays.deepToString(board);
        System.out.println("Board: " + visual); // Prints: [[X, O], [O, X]]
    }
}
