package dsa.data_structures.strings;

// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/?envType=problem-list-v2&envId=prshgx6i
public class Maximum_Number_Of_Words_Found_In_Sentences {
    static void main() {
        System.out.println(new Maximum_Number_Of_Words_Found_In_Sentences().mostWordsFound(
                new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}
        ));
    }
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for (String word: sentences)
            maxCount = Math.max(maxCount, spaceCount(word));
        return maxCount;
    }
    public int spaceCount(String word) {
        int count = 0;
        for (char ch: word.toCharArray())
            if (ch == 32)
                count ++;
        return count + 1;
    }
}
