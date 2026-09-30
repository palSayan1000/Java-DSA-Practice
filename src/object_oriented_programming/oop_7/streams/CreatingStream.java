package object_oriented_programming.oop_7.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    static void main() {
        // converting list to stream
        List<String> list = Arrays.asList("apple", "banana", "guava", "cherry");
        Stream<String> stream = list.stream();

        // converting arrays to stream
        String[] array = {"apple", "banana", "cherry", "grapes"};
        Stream<String> myStream = Arrays.stream(array);

        // directly creating streams
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);

        Stream<Integer> intStream = Stream.iterate(0, n -> n + 1).limit(101);
        intStream.forEach(System.out::println);

        Stream<String> stringStream = Stream.generate(() -> "hello").limit(6);
        stringStream.forEach(System.out::println);
//        // Stream.generate(): takes a Supplier, infinite, so limit it
//        Random random = new Random();
//        Stream<Integer> generatedStream = Stream.generate(() -> random.nextInt(100))
//                .limit(5);
//
//        // Stream.iterate(): seed + function (infinite unless limited)
//        Stream<Integer> powersOfTwo = Stream.iterate(1, n -> n * 2)
//                .limit(8);
//
//        // Stream.iterate() with a stop condition (like a for loop)
//        Stream<Integer> multiplesOfThree = Stream.iterate(3, n -> n <= 30, n -> n + 3);
//
//        // primitive stream from a range
//        IntStream range = IntStream.rangeClosed(1, 5);
//
//        // terminal operations to actually see the output
//        stream.forEach(System.out::println);
//        myStream.forEach(System.out::println);
//        integerStream.forEach(System.out::println);
//        generatedStream.forEach(System.out::println);
//        powersOfTwo.forEach(System.out::println);
//        multiplesOfThree.forEach(System.out::println);
//        range.forEach(System.out::println);
    }
}