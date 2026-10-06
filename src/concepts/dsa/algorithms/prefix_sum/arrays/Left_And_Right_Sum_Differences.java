package concepts.dsa.algorithms.prefix_sum.arrays;

// https://leetcode.com/problems/left-and-right-sum-differences/description/
public class Left_And_Right_Sum_Differences {
    static void main() {
        System.out.println(java.util.Arrays.toString(
                new Left_And_Right_Sum_Differences().leftRightDifference(
                        new int[]{10, 4, 8, 3}
                )
        ));
    }

    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(nums[i] - (nums[nums.length - 1] - (i - 1 >= 0 ? nums[i - 1] : 0)));
        }

        return answer;
    }
}
