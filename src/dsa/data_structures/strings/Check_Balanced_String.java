package dsa.data_structures.strings;

// https://leetcode.com/problems/check-balanced-string/
public class Check_Balanced_String {
    static void main() {
        System.out.println(new Check_Balanced_String().isBalanced("1234"));
    }
    public boolean isBalanced(String num) {
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                evenSum += num.charAt(i) - 48;
            } else {
                oddSum += num.charAt(i) - 48;
            }
        }
        return evenSum == oddSum;
    }
}
