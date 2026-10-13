package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;

public class AddAll {
    public static void main() {
        System.out.println("For the first array list: ");
        ArrayList<Integer> list = InputList.input();
        System.out.println("For the second array list: ");
        ArrayList<Integer> list2 = InputList.input();
        System.out.printf("The given lists are: \n%s\n%s\n", list, list2);
        list.addAll(list2); // the list is being updated
        // or
        // list.addAll(2, list2); // adding the whole list at a specific index
        System.out.println("The new combined list: " + list);
    }
}
