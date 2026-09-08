package dsa.two_pointers.strings.problems;

public class Find_First_Palindromic_String_In_The_Array {
    static void main() {
        System.out.println(new Find_First_Palindromic_String_In_The_Array().firstPalindrome(new String[] {"abc","car","ada","racecar","cool"}));
    }
    public String firstPalindrome (String[] words) {
        for (String str: words)
            if (isPalindrome(str))
                return str;
        return "";
    }
    public boolean isPalindrome (String str) {
        for (int i = 0; i < str.length(); i ++)
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        return true;
    }
}
