package concepts.dsa.data_structures.arrays;

// https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/description/
public class Minimum_Operations_To_Make_Array_Sum_Divisible_By_K {
    static void main() {
        System.out.println(new Minimum_Operations_To_Make_Array_Sum_Divisible_By_K()
                .minOperations(new int[]{3, 9, 7}, 5));
    }

    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum % k;
    }
}
