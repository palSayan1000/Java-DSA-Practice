package dsa.data_structures.strings;

// https://leetcode.com/problems/shuffle-string/description/
public class Shuffle_String {
    static void main() {
        System.out.println(new Shuffle_String().restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));
    }
    public String restoreString(String s, int[] indices) {
        char[] str = new char[s.length()];
        for (int i = 0; i < s.length(); i ++) {
            str[indices[i]] = s.charAt(i);
        }
        return new String(str);
    }
}
