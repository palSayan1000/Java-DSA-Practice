package object_oriented_programming.oop_6.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class LamdaFunc {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{3, 4, 52, 8, 9}));
        arr.forEach((item) -> {
            System.out.print((item * 2) + "\t");
        });
        System.out.println();
        LamdaFunc obj = new LamdaFunc();
        IntStream.range(0, arr.size() - 1)
                 .map(i -> obj.sum(arr.get(i), arr.get(i + 1)))
                 .forEach(result -> System.out.print(result + "\t"));
    }
    int sum (int a, int b) {
        return a + b;
    }
}
