package dsa.bit_manupulation;

public class SetBit_Count {
    static void main() {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.parseInt("1001", 2));
        System.out.println(Integer.bitCount(n));
        System.out.println(setBits(n));
    }
    static int setBits(int n) {
        int count = 0;
//        while (n > 0) {
//            count ++;
//            n -= n & -n;
//        }
        // or
        while (n > 0) {
            count ++;
            n = n & (n - 1);
        }
        return count;
    }
}
