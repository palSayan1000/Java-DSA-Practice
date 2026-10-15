package dsa.data_structures.strings;

// https://leetcode.com/problems/truncate-sentence/description/
public class Truncate_Sentence {
    static void main() {
        System.out.println(new Truncate_Sentence()
                .truncateSentence("Hello how are you Contestant", 4));
    }

    public String truncateSentence(String s, int k) {
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 32)
                if (--k == 0)
                    return s.substring(0, i);

        return s;
    }
}
