package dsa.strings;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting_The_Sentence {
    static void main() {
        System.out.println(new Sorting_The_Sentence().sortSentence("is2 sentence4 This1 a3"));
    }
    public String sortSentence (String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i ++)
            if (words[i].charAt(words[i].length() - 1) - 48 != i + 1) {
                String temp = words[words[i].charAt(words[i].length() - 1) - 48 - 1];
                words[words[i].charAt(words[i].length() - 1) - 48 - 1] = words[i];
                words[i --] = temp;
            } else
                words[i] = words[i].substring(0, words[i].length() - 1);
        return String.join(" ", words);
    }
//    public String sortSentence(String s) {
//        String[] words = s.split(" ");
//        Arrays.sort(words, Comparator.comparingInt((String a) -> a.charAt(a.length() - 1) - 48));// shorter idominic java one
//        //         Arrays.sort(words, (String a, String b) -> {
//        //            return Integer.compare(a.charAt(a.length() - 1) - 48, b.charAt(b.length() - 1) - 48);
//        //        });
//        return new Sorting_The_Sentence().join(" ", words);
//    }
//    public String join(String delimiter, String[] words) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < words.length - 1; i ++)
//            sb.append(words[i], 0, words[i].length() - 1).append(delimiter);
//        sb.append(words[words.length - 1], 0, words[words.length - 1].length() - 1);
//        return sb.toString();
//    }
}
/* another way of doing using the lambda method
public String sortSentence(String s) {
    String[] words = s.split(" ");
    Arrays.sort(words, new Comparator<String>() {
        @Override
        public int compare(String a, String b) {
            return Integer.compare(a.charAt(a.length() - 1) - '0',
                                    b.charAt(b.length() - 1) - '0');
        }
    });
    return String.join(" ", words);
}
 */
/* Another way of doing using the lambda function
package dsa.strings;
import java.util.Arrays;
import java.util.Comparator;

class LastDigitComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.charAt(a.length() - 1) - '0',
                                b.charAt(b.length() - 1) - '0');
    }
}

public class Sorting_The_Sentence {
    static void main() {
        System.out.println(new Sorting_The_Sentence().sortSentence("is2 sentence4 This1 a3"));
    }
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, new LastDigitComparator());
        return String.join(" ", words);
    }
}
 */