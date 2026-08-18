package basic_understanding.arrays.one_dimentional_array;

public class First {
    public static void main(){
        //Q. Store a roll no.
        int roll = 5;

        //Q. Store a name ->
        String name = "Sayan";

        //Q. Store 5 roll numbers ->
        int roll1 = 1;
        int roll2 = 2; //......

//        // syntax
//        // datatype[] variable_name = new datatype[size];
//        // [] -> means that this is an array
//        int[] rollNumber = new int[5];
//        // or you can write directly
//        int[] rollNum = {1, 2, 3, 4, 5};
//        // here the int represents the type of data stored in the array
//        // all the types of data in the array should be same
//
        int[] rollNum; // this is known as declaration of array. here rollNum is getting defined in the stack.
        rollNum = new int[10]; // initialization actually here the memory is being created in the memory(heap).
        System.out.println(rollNum[0]); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0] <- internally is like this

        String[] arr = new String[4];
        System.out.println(arr[0]);// [null, null, null, null]
        // null is like a special type that you can reference it to string and objects and non-primitives

    }
}
