package dsa.bit_manupulation;

public class Power {
    static void main() {
        int base = 2;
        int power = 4;

        int ans = 1;

        while (power > 0) {
            if ((power & 1) == 1)
                ans *= base;
            base *= base;
            power >>= 1;
        }
        System.out.println(ans);
    }
}
