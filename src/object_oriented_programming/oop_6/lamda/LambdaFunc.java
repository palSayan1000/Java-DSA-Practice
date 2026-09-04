package object_oriented_programming.oop_6.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaFunc {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{3, 4, 52, 8, 9}));
        // arr.forEach((item) -> {
        //    System.out.print((item * 2) + "\t");
        //});
        // System.out.println();
//        LamdaFunc obj = new LamdaFunc();
//        IntStream.range(0, arr.size() - 1)
//                 .map(i -> obj.sum(arr.get(i), arr.get(i + 1)))
//                 .forEach(result -> System.out.print(result + "\t"));

        // consumer type
//        Consumer<Integer> fun = (i) -> System.out.println(i * 2);
//        arr.forEach(fun);

        Operation addition = (a, b) -> (a + b);
        Operation product = (a, b) -> (a * b);
        Operation subtraction = (a, b) -> (a - b);
         // Operation sum = Integer::sum;
        LambdaFunc myCal = new LambdaFunc();
        System.out.println(myCal.operate(5, 3, addition));
        System.out.println(myCal.operate(5, 3, product));
        System.out.println(myCal.operate(5, 3, subtraction));

    }

    private int operate (int a, int b, Operation op) {
        return op.operation(a, b);
    }
    int sum (int a, int b) {
        return a + b;
    }
}

interface Operation {
    int operation (int a, int b);
}
