package basic_understanding.arrays.one_dimentional_array;

import java.util.Scanner;
import java.util.Arrays;
public class Input {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; arr[i++] = sc.nextInt());
        System.out.println("The entered array: " + Arrays.toString(arr));
        // using for each loop
        for(int num : arr)
            System.out.print(num + " ");    //  enhanced for loop
        // here num is just the elements of the array
        // for every element in the array print the element

        // System.out.println(arr[10]]); // index out of bounds error

        // array of objects
        String str[] = new String[4];
        System.out.println("\nEnter the names for the array: ");
        for(int i = 0; i < str.length; i++)
            str[i] = sc.next();
        System.out.println("The entered names for the array: " + Arrays.toString(str));
    }
}
