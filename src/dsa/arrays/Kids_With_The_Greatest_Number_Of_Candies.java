package dsa.arrays;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
public class Kids_With_The_Greatest_Number_Of_Candies {
    static class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> ans = new ArrayList<>();
            int max = candies[0];
            for (int i : candies) max = Math.max(max, i);
            for (int i : candies)
                ans.add(i + extraCandies >= max);
            return ans;
        }
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt(), array[] = new int[size];
        System.out.println("Enter the array elements (that is the candies at each index): ");
        for(int i = 0; i < size; array[i++] = sc.nextInt());
        System.out.println("Enter the extra candies: ");
        int extraCandies = sc.nextInt();
        System.out.println("The Entered array: " + Arrays.toString(array));
        System.out.println("The required list: " +new Solution().kidsWithCandies(array, extraCandies));
        sc.close();
    }
}
