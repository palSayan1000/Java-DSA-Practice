package basic_understanding.arrays.methods;
import java.util.Arrays;

public class HashCodeToStringExample {
    public static void main(String[] args) {
        /*
         * EXPLANATION:
         * hashCode: Returns a hash code for a standard, single-dimensional
         * array based on the elements it currently holds.
         *
         * toString: Converts a 1D array into a human-readable string format,
         * returning it enclosed in square brackets with comma-separated values.
         */
        boolean[] flags = {true, false, true};

        System.out.println("Hash: " + Arrays.hashCode(flags));
        System.out.println("String: " + Arrays.toString(flags)); // Prints: [true, false, true]
    }
}
