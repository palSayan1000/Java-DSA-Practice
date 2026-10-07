package concepts.dsa.algorithms.math.problems;

// https://leetcode.com/problems/mirror-distance-of-an-integer/description/
public class Mirror_Distance_Of_An_Integer {
    static void main() {
        System.out.println(new Mirror_Distance_Of_An_Integer().mirrorDistance(25));
    }

    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }

    public int reverse(int n) {
        int rev = 0;
        for (int i = n; i > 0; i /= 10) {
            rev = rev * 10 + i % 10;
        }
        return rev;
    }
}
