package dsa.recursion.level_4_permutations;

import java.util.ArrayList;

public class StringPermu {
    static void main() {
        String str = "abcde";
        System.out.println(permutationsList(str, 0, ""));
    }
    static void permutations(String str, int index, String current) {
        if (index == str.length()) {
            System.out.println(current + "\t");
            return;
        }
        for (int i = 0; i <= index; i++)
            permutations(str, index + 1, current.substring(0, i) + str.charAt(index) + current.substring(i, index));
    }
    static ArrayList<String> permutationsList(String str, int index, String current) {
        if (index == str.length()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(current);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= index; i++)
            list.addAll(permutationsList(str, index + 1, current.substring(0, i) + str.charAt(index) + current.substring(i, index)));
        return list;
    }
}
