package object_oriented_programming.oop_7.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperationFilter {
    static void main() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 4322, 0, 9, 1, 5, 44, 23, 433, 96);
        List<Integer> filteredList = list.stream()
                .filter(x -> (x & 1) == 0)
                .distinct()
                .map(n -> n / 2)
                .sorted((a, b) -> b - a) // sorting in descending order implementing comparable using lambda bitch
//                .skip(1) // skip written up or down performs differently try you will understand
                .limit(4)
                .skip(1)
                //.peek(System.out::println)
                .toList();
        // like wise
        // .max().get();
        // .min().get();
        // .count() // these are terminal operation

        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.parallelStream().count()); // .count() -> sum of all the elements in the stream

//        Stream.iterate(0, x -> x + 1)
//                .limit(101)
//                .skip(1)
//                .filter(Prime_Check::isPrime)
//                .forEach(System.out::print);

//        System.out.println(filteredList);

//        List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).toList();
//        System.out.println(filteredList);
//
//        System.out.println(filteredList.stream().map(x -> x / 2).toList());

        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4));

        List<Integer> doubled = nums.stream().map(n -> n * 2).toList();
        // nums is still [1, 2, 3, 4]

        nums.replaceAll(n -> n * 2);          // transforms every element in place
        nums.removeIf(n -> n % 2 == 0);       // filters in place
    }
}
