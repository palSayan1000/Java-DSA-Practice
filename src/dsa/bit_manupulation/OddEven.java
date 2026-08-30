package dsa.bit_manupulation;

public class OddEven {
    static void main() {
        int n = 3;
        if ((n & 1) == 1)
            System.out.println("Odd");
        else System.out.println("Even");
    }
}
