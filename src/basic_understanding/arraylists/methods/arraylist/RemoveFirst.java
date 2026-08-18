package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;

public class RemoveFirst {
    public static void main() {
        var list = InputList.input();
        System.out.println("The Entered list: " + list);
        var i = list.removeFirst(); // returns the removed element
        System.out.println("The removed element: " + i);
        System.out.println("The updated list: " + list);
    }
}
