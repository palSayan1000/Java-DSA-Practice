package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Clear {
    static void main() {
        // void	clear()
        // Removes all of the elements from this collection (optional operation).
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = InputList.input();
        System.out.println("Given list: " + list);
        list.clear();
        System.out.println("New list: " + list);
        sc.close();
    }
}
