package basic_understanding.arraylists.methods.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class Contains {
    public static void main() {
        ArrayList<Integer> list = InputList.input();
        System.out.println("The given list: " + list);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element for check: ");
        System.out.println("The result: " + list.contains(sc.nextInt()));
        sc.close();
    }
}
