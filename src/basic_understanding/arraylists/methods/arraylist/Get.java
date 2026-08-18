package basic_understanding.arraylists.methods.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class Get {
    public static void main() {
        var list = InputList.input();
        System.out.println("Enter the index to get the element: ");
        var index = new Scanner(System.in).nextInt();
        System.out.println("The given list: " + index);
        System.out.println("The element at the specified index: " + list.get(index));
    }
}
