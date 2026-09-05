package dsa.searching.binary;

//https://leetcode.com/problems/split-array-largest-sum/description/

public class Split_Array_Largest_Sum {
    static void main() {
        System.out.println(splitArray(new int[]{7,2,5,10,8}, 2));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); //
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the middle as the potential answer
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with the max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums)
                if (sum + num > mid) {
                    // you cannot add this in the sub array
                    // lets say you add this num into the new subarray, then sum = num
                    sum = num;
                    pieces ++;
                } else
                    sum += num;

            if (pieces > k)
                start = mid + 1;
            else
                end = mid;
        }
        return end;
    }
}