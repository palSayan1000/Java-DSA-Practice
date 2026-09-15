package dsa.data_structures.strings;

// https://leetcode.com/problems/shifting-letters/description/
public class Shifting_Letters {
    static void main() {
        System.out.println(new Shifting_Letters().shiftingLetters("abc", new int[] {3, 5, 9}));
    }
    public String shiftingLetters(String s, int[] shifts) {
        char[] newStr = s.toCharArray();
        long prefixSum = 0;

        for (int i = shifts.length - 1; i >= 0; i --) {
            prefixSum += shifts[i];
            newStr[i] = (char)((newStr[i] - 97 + prefixSum) % 26 + 97);
        }

        return String.valueOf(newStr);
    }
}
