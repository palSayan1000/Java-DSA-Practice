package dsa.algorithms.two_pointers.arrays.problems;

import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
public class Count_Pairs_Whose_Sum_Is_Less_Than_Target {
    static void main() {
        System.out.println(new Count_Pairs_Whose_Sum_Is_Less_Than_Target()
                .countPairs(List.of(-6,2,5,-2,-7,-1,3), -2));
    }

    public int countPairs(List<Integer> nums, int target) {
        int pairCount = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }
}
