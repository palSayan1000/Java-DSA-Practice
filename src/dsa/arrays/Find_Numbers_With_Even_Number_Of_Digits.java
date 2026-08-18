package dsa.arrays;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Find_Numbers_With_Even_Number_Of_Digits {
    public static void main() {
        System.out.println("The no.of even digits in the array: " + new Solution().findNumbers(new int[]{12,345,2,6,7896}));
    }
    static class Solution {
        public int findNumbers(int[] nums){
            int count = 0;
            for(int i: nums)
                if (evenDigits(i))
                    count++;
            return count;
        }
        public boolean evenDigits(int n){
//            int count = 1;
//            while((n/=10) > 0)
//                count++;
//            return count % 2 == 0;
            return ((int)Math.log10(n) + 1) % 2 == 0;
        }
    }
}
