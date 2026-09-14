package dsa.stacks_queues.problems.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game_Of_Two_Stacks {
    public int twoStacks(int x, int[] a, int[] b) {
        return twoStacks(x, a, b, 0, 0) - 1;
    }
    public static int twoStacks(int x, int[] a, int[] b, int sum, int count) {
        if (sum > x) {
            return count;
        }

        if (a.length == 0 || b.length == 0) {
            return count;
        }

        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }
    // the official correct code
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        int i = 0, sum = 0;
        while (i < a.size() && sum + a.get(i) <= maxSum) {
            sum += a.get(i);
            i++;
        }

        int maxCount = i;
        int j = 0;
        while (j < b.size()) {
            sum += b.get(j);
            j++;
            while (sum > maxSum && i > 0) {
                i--;
                sum -= a.get(i);
            }
            if (sum > maxSum) break;
            maxCount = Math.max(maxCount, i + j);
        }

        return maxCount;
    }
}
