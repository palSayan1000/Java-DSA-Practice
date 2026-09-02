package dsa.prefix_sum.arrays;

import java.util.Arrays;

public class Product_Of_Array_Except_Self {
    static void main() {
        System.out.println("Product of array except self: " +
                Arrays.toString(new Product_Of_Array_Except_Self().productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
    int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++)
            ans[i] = ans[i - 1] * nums[i - 1];
        int suffix = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            ans[i] = ans[i] * suffix;
            suffix *= nums[i];
        }
        return ans;
    }
}
