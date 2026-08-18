package basic_understanding.arraylists.methods.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class Insert {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = InputList.input();
        System.out.println("Enter the element to insert and the index respectively: ");
        int element = sc.nextInt(), index = sc.nextInt();
        System.out.println("Given List: " + list);
        list.add(index, element); // inserting element at a specified index
        System.out.println("New List: " + list);
    }
}
