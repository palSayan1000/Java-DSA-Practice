package dsa.algorithms.two_pointers.arrays.problems;

import java.util.Arrays;

public class Contains_Duplicate {
    static void main() {
        System.out.println(new Contains_Duplicate().containsDuplicate(new int[] {1, 2, 3, 4, 2}));
    }

    public boolean containsDuplicate(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();

        // for (int i: nums)
        //     if (!set.add(i))
        //         return true;

        // return false;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1])
                return true;

        return false;
    }
}
