package dsa.recursion.level_1;

public class Sum_Digits {
    static void main() {
        System.out.println(sum(1342));
    }
    static int sum(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sum(n / 10);
    }
}
