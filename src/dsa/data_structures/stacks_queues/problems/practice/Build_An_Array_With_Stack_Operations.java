package dsa.data_structures.stacks_queues.problems.practice;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/build-an-array-with-stack-operations/description/?envType=problem-list-v2&envId=dsa-linear-shoal-stack
public class Build_An_Array_With_Stack_Operations {
    static void main() {
        System.out.println(new Build_An_Array_With_Stack_Operations().buildArray(new int[]{1, 3}, 3));
    }

    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1, j = 0; j < target.length; i++) {
            if (i == target[j]) {
                list.add("Push");
                j++;
            } else if (i != target[j]) {
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}
