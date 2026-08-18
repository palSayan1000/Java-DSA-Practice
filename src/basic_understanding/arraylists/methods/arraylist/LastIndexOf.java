package basic_understanding.arraylists.methods.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class LastIndexOf {
    public static void main() {
        //int
        //lastIndexOf(Object o)
        //Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
        var sc = new Scanner(System.in);
        var list =InputList.input();
        System.out.println("The entered list: " + list);
        System.out.println("Enter the element to get its last index: " + list.lastIndexOf(sc.nextInt()));
    }
}
