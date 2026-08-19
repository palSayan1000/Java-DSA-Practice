package dsa.strings;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class Check_If_The_Sentence_Is_Panagram {
    static void main() {
        System.out.println("Enter the string: ");
        System.out.println("The result: " + checkIfPangram(new java.util.Scanner(System.in).nextLine()));
    }
    static public boolean checkIfPangram(String sentence) {
        if(sentence.isBlank() || sentence.length() < 26)
            return false;
        int[] freq = new int[26];
        for (int i: sentence.toCharArray())
            freq[i - 97] ++;
        for (int i: freq)
            if (i == 0)
                return false;
        return true;
    }
}
