package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;

public class RemoveAll {
    static void main() {
        var list = InputList.input();
        System.out.println("In this 2nd list enter the elements that is to be removed from the first list ->");
        var removeList = InputList.input();
        System.out.println("The given list: " + list);
        list.removeAll(removeList);
        System.out.println("The remove list: " + removeList);
        System.out.println("The updated list: " + list);
    }
}
