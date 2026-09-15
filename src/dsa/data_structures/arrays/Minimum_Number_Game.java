package dsa.data_structures.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-number-game/description/?envType=problem-list-v2&envId=prshgx6i
public class Minimum_Number_Game {
    static void main() {
        System.out.println(Arrays.toString(new Minimum_Number_Game().numberGame(
                new int[] {5,4,2,3}
        )));
    }
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        return nums;
    }
}
