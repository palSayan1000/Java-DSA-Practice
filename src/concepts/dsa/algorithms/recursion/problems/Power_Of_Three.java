package concepts.dsa.algorithms.recursion.problems;

// https://leetcode.com/problems/power-of-three/description/
public class Power_Of_Three {
    static void main() {
        System.out.println(new Power_Of_Three().isPowerOfThree(27));
    }

    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        return n % 3 == 0 && isPowerOfThree(n / 3);
    }
}
