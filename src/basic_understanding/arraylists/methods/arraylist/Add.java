package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;

public class Add {
    public static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the array elements: ");
        // sc.hasNextInt() -> returns true as long as the user enters int
        while(sc.hasNextInt())
            list.add(sc.nextInt());
        // boolean -> return type always return true
        // add(E e) -> method
        // Appends the specified element to the end of this list.
        sc.close();
        System.out.println("The entered list: " + list);
    }
}
