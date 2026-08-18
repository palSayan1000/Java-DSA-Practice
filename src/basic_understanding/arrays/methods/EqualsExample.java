package basic_understanding.arrays.methods;
import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * Returns true if both arrays contain the exact same elements in
         * the exact same order. It does *not* recursively check nested arrays.
         */
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {10, 20, 30};
        int[] arr3 = {30, 20, 10};

        System.out.println(Arrays.equals(arr1, arr2)); // Prints: true
        System.out.println(Arrays.equals(arr1, arr3)); // Prints: false (order matters)
    }
}
