package dsa.recursion.level_1;

public class Product_Digits {
    static void main() {
        System.out.println(prod(1342));
    }
    static int prod(int n) {
        if (n == 0)
            return 1;
        return n % 10 * prod(n / 10);
    }
}