package dsa.data_structures.hashmap.problems.practice;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/restore-finishing-order/description/
public class Restore_Finishing_Order {
    static void main() {
        System.out.println(java.util.Arrays.toString(
                new Restore_Finishing_Order().recoverOrder(
                        new int[]{3, 1, 2, 5, 4},
                        new int[]{1, 3, 4}
                )
        ));
    }

    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        int k = 0;

        for (int i : friends) {
            set.add(i);
        }

        for (int i : order) {
            if (set.contains(i))
                friends[k++] = i;
        }

        return friends;
    }
}
