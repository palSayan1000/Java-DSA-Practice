package basic_understanding.arraylists.methods.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class Remove {
    static void main() {
        var sc = new Scanner(System.in);
        var list = InputList.input();
        System.out.println("Enter the element to remove: ");
        int element = sc.nextInt();// only removes the first occarance of the element;// return boolean
        System.out.println("Enter the index of the element to be removed: ");
        int index = sc.nextInt();
        list.remove(Integer.valueOf(element)); // an interger objject needs to be given
        list.remove(index); // it returns the element that is being removed
        System.out.println("The list after removing two elements: " + list);
    }
}
