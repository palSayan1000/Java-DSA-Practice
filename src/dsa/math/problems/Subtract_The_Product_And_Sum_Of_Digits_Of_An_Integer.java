package dsa.math.problems;

public class Subtract_The_Product_And_Sum_Of_Digits_Of_An_Integer {
    static void main() {
        System.out.println(new Subtract_The_Product_And_Sum_Of_Digits_Of_An_Integer().subtractProductAndSum(4421));
    }

    public int subtractProductAndSum(int n) {
        return prodDigits(n) - sumDigits(n);
    }

    public int prodDigits(int n) {
        int prod = 1;
        for (int i = n; i > 0; i /= 10)
            prod *= i % 10;
        return prod;
    }

    public int sumDigits(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 10)
            sum += i % 10;
        return sum;
    }
}
