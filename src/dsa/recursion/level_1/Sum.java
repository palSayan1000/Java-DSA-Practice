package dsa.recursion.level_1;

public class Sum {
    static void main() {
        System.out.println(sum(5));
    }
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
}
