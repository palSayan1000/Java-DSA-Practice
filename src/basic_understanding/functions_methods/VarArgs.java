package basic_understanding.functions_methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // what do wee mean by variable length arguments ->
        // when we do not know how many inputs we are giving
        func(1, 2, 3, 5, 8, 2, 456, 987, 21, 879, 654, 5, 12, 13, 14, 13);
        // i can pass any no of arguments
        // this is the beauty of variable length argumnets
        // internally it stores it an array
        // the length is not constant it varies with the input
        // func(); this will also work this will be an empty array 0 arguments
        multiple(2, 3, "Kunal", "Sayan", "Pal", "Rahul", "Allah amar gare");
    }

    static void multiple (int a, int b, String... names) {

    }

    static void func (int ...nums) {
        // int ...nums -> internally it is taking it as an array of integers
        // or char ...ch or String... str (three dots are needed)
        System.out.println(Arrays.toString(nums)); // arrays is just a collection of integers
    }
}
