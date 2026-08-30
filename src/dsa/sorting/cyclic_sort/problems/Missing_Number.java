package dsa.sorting.cyclic_sort.problems;
// https://leetcode.com/problems/missing-number/description/
public class Missing_Number {
    static void main() {
        int[] numbs = {3, 0, 1};
        System.out.println("The missing number is: " + missingNumber(numbs));
    }
    static int missingNumber(int[] nums) {
        // sort cyclic
        for (int i = 0; i < nums.length; i ++)
            if (nums.length != nums[i] && nums[i] != i) {
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
                i--;
            }
        // search the missing no.
        for (int i = 0; i < nums.length; i++)
            if(i != nums[i])
                return i;
        return nums.length;
    }
}
