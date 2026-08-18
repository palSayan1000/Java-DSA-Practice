package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;

public class ToArray {
    static void main() {
        var list = InputList.input();
        System.out.println("The entered list: " + list);
        // Correct way to get an Integer array
        Integer[] array = list.toArray(new Integer[0]);
    }
}
