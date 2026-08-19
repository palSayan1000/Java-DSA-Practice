package dsa.arrays;

//https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array_In_The_Given_Order {
    static class Solution {
        static public int[] createTargetArray(int[] nums, int[] index) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++)
                list.add(index[i], nums[i]);
            int[] ans = new int[nums.length];
            for (int i = 0; i < ans.length; i++)
                ans[i] = list.get(i);
            return ans;
        }
    }

    static void main() {
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1})));
    }
}
