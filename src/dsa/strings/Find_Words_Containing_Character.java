package dsa.strings;

import java.util.ArrayList;
import java.util.List;

public class Find_Words_Containing_Character {
    static void main() {
        System.out.println(new Find_Words_Containing_Character().findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a'));
    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
            if (words[i].indexOf(x) != -1)
                list.add(i);
        return list;
    }
}
