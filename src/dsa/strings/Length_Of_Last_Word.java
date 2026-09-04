package dsa.strings;

public class Length_Of_Last_Word {
    static void main() {
        Length_Of_Last_Word obj = new Length_Of_Last_Word();
        String s = "   fly me   to   the moon  ";
        System.out.println(obj.lengthOfLastWord(s));
    }
    int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) != 32) i --;
        return s.length() - i - 1;
    }
}
