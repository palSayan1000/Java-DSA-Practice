package dsa.recursion.level_5_combinations;

import java.util.ArrayList;

// https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
public class Number_Of_Dice_Rolls_With_Target_Sum {
    static void main() {
//        dice("", 4);
        System.out.println(numRollsToTarget(2, 6, 7));
    }
    // not submitted in leetcode as it is a dp problem
    // will give time limit exceeded
    static int numRollsToTarget(int n, int k, int target) {
        if (target == 0)
            return 1;
        if (n == 0)
            return 0;
        int count = 0;
        for (int i = 1; i <= k && i <= target; i ++)
            count += numRollsToTarget(n - 1, k, target - i);
        return count;
    }
    /// Kunal's one
    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++)
            dice(p + i, target - i);
    }
    // returning list
    /// Kunal's two
    static ArrayList<String> diceRtn(String p, int target) {
        if (target == 0) {
            var res = new ArrayList<String>();
            res.add(p);
            return res;
        }
        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++)
            res.addAll(diceRtn(p + i, target - i));
        return res;
    }
}
