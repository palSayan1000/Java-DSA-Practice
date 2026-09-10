package dsa.strings;

public class Divisible_And_Non_divisible_Sums_Difference {
    static void main() {
        System.out.println(new Divisible_And_Non_divisible_Sums_Difference().differenceOfSums(10, 3));
    }

    public int differenceOfSums(int n, int m) {
        int total = n * (n + 1) / 2;          // sum of [1, n]
        int k = n / m;                         // how many multiples of m fit in [1, n]
        int num2 = m * k * (k + 1) / 2;        // sum of those multiples (AP again)
        return total - 2 * num2;               // num1 - num2 = total - 2*num2
    }
}
