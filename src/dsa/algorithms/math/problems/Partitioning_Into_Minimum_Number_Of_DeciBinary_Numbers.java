package dsa.algorithms.math.problems;

// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/
public class Partitioning_Into_Minimum_Number_Of_DeciBinary_Numbers {
    static void main() {
        System.out.println(new Partitioning_Into_Minimum_Number_Of_DeciBinary_Numbers()
                .minPartitions("32"));
    }

    public int minPartitions(String n) {
        int maxDigit = 0;

        for (char ch : n.toCharArray()) {
            maxDigit = Math.max(maxDigit, ch - 48);
        }

        return maxDigit;
    }
}
