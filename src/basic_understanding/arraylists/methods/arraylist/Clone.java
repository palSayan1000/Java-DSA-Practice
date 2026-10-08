package basic_understanding.arraylists.methods.arraylist;

import java.util.ArrayList;

public class Clone {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // 1. First, create your original list
        ArrayList<Integer> list = InputList.input();

        // 2. Then, on a separate line, clone it (remembering to cast it)
        ArrayList<Integer> listClone = (ArrayList<Integer>) list.clone();

        System.out.println("The entered array: " + list);
        System.out.println("The cloned array: " + listClone);
    }
}