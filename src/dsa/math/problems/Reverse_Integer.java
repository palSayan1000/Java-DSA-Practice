package dsa.math.problems;

public class Reverse_Integer {
    static void main() {
        System.out.println(new Reverse_Integer(). reverse(1534236469));
    }

    private int reverse(int num) {
        int sign = num < 0? -1 : 1;
        long reverse = 0;
        for (int i = Math.abs(num); i > 0 && reverse <= Integer.MAX_VALUE; i /= 10)
            reverse = reverse * 10 + i % 10;
        return (int) (reverse > Integer.MAX_VALUE? 0 : reverse) * sign;
    }
}
