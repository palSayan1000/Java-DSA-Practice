package dsa.arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

import java.util.*;

public class How_Many_Numbers_Are_Smaller_Than_The_Current_Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; array[i++] = sc.nextInt()) {
        }
        System.out.printf("The given array: %s,\nThe resultant array is: %s", Arrays.toString(array), Arrays.toString(new Solution().smallerNumbersThanCurrent(array)));
    }
    static class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] freqCount = new int[101];
            for (int i = 0; i < nums.length; freqCount[nums[i++]]++) ;
            for (int i = 1; i < 101; freqCount[i] += freqCount[i++ - 1]) ;
            for (int i = -1; ++i < nums.length; nums[i] = nums[i] == 0 ? 0 : freqCount[nums[i] - 1]) ;
            return nums;
        }
    }
}