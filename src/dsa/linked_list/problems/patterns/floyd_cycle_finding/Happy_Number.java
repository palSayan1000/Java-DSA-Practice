package dsa.linked_list.problems.patterns.floyd_cycle_finding;

// https://leetcode.com/problems/happy-number/description/
public class Happy_Number {

    static void main() {
        System.out.println(new Happy_Number().isHappy(12));
    }

    boolean isHappy(int n) {
        if (n == 1) return true;
        int slow = n, fast = n;

        do {
            slow = getDigitSquareSum(slow);
            fast = getDigitSquareSum(getDigitSquareSum(fast));
        } while (fast != slow);

        return slow == 1;
    }

    int getDigitSquareSum(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 10)
            sum += (int) Math.pow(i % 10, 2);
        return sum;
    }
}
