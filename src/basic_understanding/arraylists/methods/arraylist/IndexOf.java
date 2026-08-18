package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;

public class IndexOf {
    static void main() {
        //  int
        //indexOf(Object o)
        //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        var list = InputList.input();
        System.out.println("The entered list: " + list);
        System.out.println("Enter the element to get its index: ");
        System.out.println("The index of first element in the list: " + list.indexOf(new java.util.Scanner(System.in).nextInt()));
    }
}
