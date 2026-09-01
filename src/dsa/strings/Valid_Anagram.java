package dsa.strings;

public class Valid_Anagram {
    static void main() {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
//        for (char c: s.toCharArray())
//            freq[c - 97] ++;
//        for (char c: t.toCharArray())
//            freq[c - 97] --;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int i: freq)
            if (i != 0) return false;
        return true;
    }
}
