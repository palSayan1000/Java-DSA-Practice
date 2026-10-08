package basic_understanding.functions_methods;

import java.util.Arrays;

public class ChangeValue {
    static void main() {
        // create an array
        int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
