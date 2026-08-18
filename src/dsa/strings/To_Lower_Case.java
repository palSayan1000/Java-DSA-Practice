package dsa.strings;

public class To_Lower_Case {
    static void main() {
        System.out.println("Enter the string:");
        System.out.println("The lowerCase: " + new Solution().toLowerCase(new java.util.Scanner(System.in).next()));
    }
}

class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}