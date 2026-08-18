package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;

public class RemoveLast {
    public static void main() {
        var list = InputList.input();
        System.out.println("the Entered list: " + list);
        list.removeLast(); // returns the last element
        System.out.println("The nnew list: " + list);
    }
}
