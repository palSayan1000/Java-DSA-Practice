package dsa.strings;
//https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=problem-list-v2&envId=prshgx6i
public class First_Unique_Character_In_A_String {
    static void main() {
        System.out.println("loveleetcode".charAt(new First_Unique_Character_In_A_String().firstUniqChar("loveleetcode")));
    }
    int firstUniqChar(String s) {
        int[] freq = new  int[26];
        for (int i: s.toCharArray())
            freq[i - 97] ++;
        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i) - 97] == 1)
                return i;
        return -1;
    }
}
