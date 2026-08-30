package dsa.math;

public class Factors {
    static void main() {
        factors3(36);
    }
    // O(n)
    static void factors1(int n) {
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.print(i + " ");
    }
    // O(sqrt(n))
    static void factors2(int n) {
        for (int i = 1; i * i<= n; i++)
            if (n % i == 0)
                System.out.print(i == n / i ? i + " " : i + " " + n / i + " ");
        System.out.println();
    }
    // both time and space will be O(sqrt(n))
    static void factors3(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i * i <= n; i++)
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i)
                    sb.insert(0, n / i + " ");
            }
        System.out.print(sb + "\n");
    }
}
