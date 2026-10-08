package dsa.algorithms.bit_manupulation.problems;

// https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
public class Count_The_Number_Of_Consistent_Strings {
    static void main() {
        System.out.println(new Count_The_Number_Of_Consistent_Strings().countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int[] freq = freqCount(allowed);
        int count = 0;

        for (String word : words) {
            if (checkOccurance(word, freq)) {
                count++;
            }
        }

        return count;
    }

    private boolean checkOccurance(String word, int[] freq) {
        for (char ch : word.toCharArray()) {
            if (freq[ch - 97] == 0) {
                return false;
            }
        }

        return true;
    }

    private int[] freqCount(String word) {
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 97]++;
        }
        return freq;
    }

//    public int countConsistentStrings(String allowed, String[] words) {
//        int[] freqAllowed = new int[26],
//                freqHelper = new int[26];
//        int count = 0;
//        adjustFreq(freqAllowed, allowed);
//
//        for (String word: words) {
//            adjustFreq(freqHelper, word);
//            if (isFreqEqual(freqAllowed, freqHelper)) {
//                count++;
//            }
//        }
//
//        return count;
//    }
//
//    private boolean isFreqEqual(int[] freqAllowed, int[] freqHelper) {
//        for (int i = 0; i < 26; i++) {
//            if (freqAllowed[i] == 0 && freqHelper[i] > 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    private void adjustFreq(int[] freqAllowed, String word) {
//        Arrays.fill(freqAllowed, 0);
//        for (char ch : word.toCharArray()) {
//            freqAllowed[ch - 97]++;
//        }
//    }


//    public int countConsistentStrings(String allowed, String[] words) {
//        final int allowedMask = encode(allowed);
//        return (int) Arrays.stream(words)
//                .filter(word -> (encode(word) & ~allowedMask) == 0)
//                .count();
//    }
//
//    private int encode(String str) {
//        int mask = 0;
//        for (char c : str.toCharArray()) {
//            mask |= 1 << (c - 'a');
//        }
//        return mask;
//    }
}
