package dsa.data_structures.arrays;

// https://leetcode.com/problems/max-consecutive-ones/description/?envType=problem-list-v2&envId=dsa-linear-shoal-array-i
public class Max_Consecutive_Ones {
    static void main() {
        System.out.println(new Max_Consecutive_Ones().findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}));
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for (int i: nums) {
            if (i == 0) {
                maxCount = Math.max(maxCount, count);
                count = 0;
            } else {
                count ++;
            }
        }
        return maxCount = Math.max(maxCount, count);
    }
}
