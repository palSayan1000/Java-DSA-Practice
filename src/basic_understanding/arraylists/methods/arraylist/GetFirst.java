package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;

public class GetFirst {
    public static void main() {
        var list = InputList.input();
        System.out.println("The entered list: " + list);
        System.out.println("The first element: "+ list.getFirst());
    }
}
