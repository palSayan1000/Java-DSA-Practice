package concepts.object_oriented_programming.oop_7.streams;

import java.util.Arrays;

public class Intro {
    static void main() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // imperative approach
        int sum = 0;

        for (int j : array) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        System.out.println("Imperative Method : " + sum);

        // stream
        int sum2 = Arrays.stream(array).filter(n -> n % 2 == 0).sum();
        System.out.println("Stream Method : " + sum2);
    }
}
