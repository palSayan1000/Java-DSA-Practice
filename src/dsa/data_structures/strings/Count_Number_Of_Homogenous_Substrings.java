package dsa.data_structures.strings;

// https://leetcode.com/problems/count-number-of-homogenous-substrings/description/
public class Count_Number_Of_Homogenous_Substrings {
    static void main() {
        System.out.println(new Count_Number_Of_Homogenous_Substrings().countHomogenous("abbcccaa"));
    }
    public int countHomogenous(String s) {
        if (s.isBlank())
            return 0;
        long currCount = 1, ans = 0;

        for (int i = 1; i < s.length(); i ++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currCount ++;
            } else {
                ans += currCount * (currCount + 1) / 2;
                currCount = 1;
            }
        }
        ans += currCount * (currCount + 1) / 2;
        return (int)(ans % (Math.pow(10, 9) + 7));
    }
}
