package dsa.algorithms.math.problems;

// https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/
public class Find_Minimum_Operations_To_Make_All_Elements_Divisible_By_Three {
    public int minimumOperations(int[] nums) {
        int count = 0;

        for (int i : nums) {
            if (i % 3 != 0) {
                count++;
            }
        }

        return count;
    }

    static void main() {
        System.out.println(new Find_Minimum_Operations_To_Make_All_Elements_Divisible_By_Three()
                .minimumOperations(new int[] {1, 2, 3, 4, 5}));
    }
}
