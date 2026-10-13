package dsa.algorithms.math.problems;

// https://leetcode.com/problems/find-the-maximum-achievable-number/description/
public class Find_The_Maximum_Achievable_Number {
    static void main() {
        System.out.println(new Find_The_Maximum_Achievable_Number().theMaximumAchievableX(4, 1));
    }

    public int theMaximumAchievableX(int num, int t) {
        return num + t * 2;
    }
}
