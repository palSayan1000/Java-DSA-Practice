package dsa.recursion.level_1;

import static dsa.recursion.level_1.Reverse_Num.reverse; // imported the reverse function from reverse num class

public class Palin_Num {
    static void main() {
        int n = 12345;
        System.out.println(reverse(n) == n? "Palindrome Num" : "Not Palin");
    }
}
