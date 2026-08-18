package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;

public class InputList {
    public static ArrayList<Integer> input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the array elements: ");
        while (sc.hasNextInt())
            list.add(sc.nextInt());
        sc.nextLine();
        return list;
    }
    public static ArrayList<Integer> input(java.util.Scanner sc){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the array elements: ");
        while (sc.hasNextInt())
            list.add(sc.nextInt());
        sc.nextLine();
        return list;
    }
}