package dsa.sliding_window.dynamic;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the String: ");
        System.out.println("The Longest Substring Without Repeating Characters Length: " +
                new Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring(sc.next()));
        sc.close();
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int occFlag[] = new int[256], maxLen = 0;
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (i < occFlag[s.charAt(j)])
                i = occFlag[s.charAt(j)];
            maxLen = Math.max(maxLen, j - i + 1);
            occFlag[s.charAt(j)] = j + 1;
        }
        return maxLen;
    }
}
