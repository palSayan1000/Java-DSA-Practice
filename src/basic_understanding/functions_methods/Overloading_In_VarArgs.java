package basic_understanding.functions_methods;

import java.util.Arrays;

public class Overloading_In_VarArgs {
    public static void main() {
        demo(1, 2, 3);
        demo("kunal", "Sayan", "Pal", "hello");
        // demo(); // error
        // here the VarArgs method parameter could not be empty as at compile time it could not decide which to call
    }
    static void demo (int... arr) {
        System.out.println(Arrays.toString(arr));
    }

    static void demo (String... arr) {
        System.out.println(Arrays.toString(arr));
    }

    static void demo(char ...arr) {
        System.out.println(Arrays.toString(arr));
    }
}
