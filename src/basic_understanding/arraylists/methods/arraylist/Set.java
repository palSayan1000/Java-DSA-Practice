package basic_understanding.arraylists.methods.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class Set {
    public static void main() {
        var sc = new Scanner(System.in);
        var list = InputList.input();
        //E
        //set(int index, E element)
        //Replaces the element at the specified position in this list with the specified element.
        System.out.println("Enter the index and element to be replaced: ");
        int index = sc.nextInt(), element = sc.nextInt();
        System.out.println("The entered list: " + list);
        System.out.println("The element returned by the method: " + list.set(index, element));
        System.out.println("The updated list: " + list);
    }
}
