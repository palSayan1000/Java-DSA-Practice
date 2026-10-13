package basic_understanding.arraylists.methods.arraylist;

import java.util.Scanner;

public class AddLast {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        var list = InputList.input();
        System.out.println("Enter the element to add at the last of the list: ");
        var element = sc.nextInt();
        System.out.println("List before: " + list);
        list.addLast(element);
        System.out.println("List after: " + list);
        sc.close();
    }
}
