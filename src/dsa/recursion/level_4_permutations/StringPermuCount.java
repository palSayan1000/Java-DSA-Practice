package dsa.recursion.level_4_permutations;

public class StringPermuCount {
    static void main() {
        String str = "abcde";
        System.out.println("Total no.of permutations: " + permutations(str, 0, ""));
    }
    static int permutations(String str, int index, String current) {
        if (index == str.length())
            return 1;
        int count = 0;
        for (int i = 0; i <= index; i++)
            count += permutations(str, index + 1, current.substring(0, i) + str.charAt(index) + current.substring(i, index));
        return count;
    }
}
