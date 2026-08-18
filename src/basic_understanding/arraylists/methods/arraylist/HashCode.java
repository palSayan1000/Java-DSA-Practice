package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;

public class HashCode {
    public static void main() {
        var list = InputList.input();
        System.out.println("The entered list: " + list);
        System.out.println("the hashcode: " + list.hashCode());
    }
}
