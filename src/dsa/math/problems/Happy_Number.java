package dsa.math.problems;

import java.util.HashSet;

public class Happy_Number {
    static void main() {
        System.out.println("Happy Number: " + isHappy(1111111));
    }
    static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        do {
            int sum = 0;
            for (int i = n; i > 0; sum += (int)Math.pow(i % 10, 2), i /= 10);
            n = sum;
        } while (set.add(n));
        return n == 1;
    }
}