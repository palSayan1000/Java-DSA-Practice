package dsa.data_structures.strings;

// https://leetcode.com/problems/number-of-changing-keys/description/?envType=problem-list-v2&envId=prshgx6i
public class Number_Of_Changing_Keys {
    static void main() {
        System.out.println(new Number_Of_Changing_Keys().countKeyChanges("aAbBcC"));
    }

    public int countKeyChanges(String s) {
        char prev = '\0';
        int count = 0;

        for (char ch : s.toLowerCase().toCharArray()) {
            if (prev != ch) {
                count++;
            }
            prev = ch;
        }

        return count - 1;
    }
}
