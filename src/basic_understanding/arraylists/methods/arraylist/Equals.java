package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;

public class Equals {
    public static void main() {
        System.out.println("Enter the two list: ");
        var list1 = InputList.input();
        var list2 = InputList.input();
        System.out.println("The two list are: \n" + list1 +  "\n" + list2);
        System.out.println("The check (equals): " + list1.equals(list2));
    }
}
