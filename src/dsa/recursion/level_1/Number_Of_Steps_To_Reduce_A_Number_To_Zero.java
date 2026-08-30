package dsa.recursion.level_1;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class Number_Of_Steps_To_Reduce_A_Number_To_Zero {
    static void main() {
        int num = 14;
        System.out.println("Number of steps: " + numberOfSteps(num));
    }
    static int numberOfSteps(int num) {
        if (num == 0)
            return 0;
        return numberOfSteps(num % 2 == 0? num / 2 : num - 1) + 1;
    }
}
