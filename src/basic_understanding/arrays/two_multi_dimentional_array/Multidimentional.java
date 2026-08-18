package basic_understanding.arrays.two_multi_dimentional_array;

import java.util.*;

public class Multidimentional {
    public static void main() {
        /*
                1 2 3
                4 5 6
                7 8 9
         */

        int[][] arr = new int[3][];
        // specification of the number of rows is mandatory but not the columns
        int[][] nums = {
                {1, 2, 3}, // 0 th index
                {4, 5}, // 1 th index
                {6, 7, 8, 9} // 2 th index
        }; // You can declare the array directly like this
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.deepToString(nums));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));

        // Input
//
//        int[][] arr = new int[3][3];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array elements: ");
//        for(int[] i : arr)
//            for(int j = 0; j < 3; i[j++] = sc.nextInt());
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.deepToString(arr));

        //input
        Scanner sc = new Scanner(System.in);
        for(int row = 0; row < arr.length; row++){
            System.out.printf("Enter the length of this %dth row: ", row + 1);
            arr[row] = new int[sc.nextInt()];
            System.out.println("Enter the array elements: ");
            for(int i = 0; i < arr[row].length; i++){
                arr[row][i] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println();
//
//        // output
//        for(int row = 0; row < arr.length; row++, System.out.println())
//            for(int col = 0; col < arr[row].length; System.out.print(arr[row][col] + "\t"));
        // output
        for(int[] row: arr){
            for(int num: row)
                System.out.print(num + "\t");
            System.out.println();
        }
    }
}
