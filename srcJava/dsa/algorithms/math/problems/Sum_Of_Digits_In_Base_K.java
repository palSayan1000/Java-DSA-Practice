package dsa.algorithms.math.problems;

// https://leetcode.com/problems/sum-of-digits-in-base-k/description/
public class Sum_Of_Digits_In_Base_K {
    static void main() {
        System.out.println(new Sum_Of_Digits_In_Base_K()
                .sumBase(34, 6));
    }

    public int sumBase(int n, int k) {
        int sum = 0;

        while (n > 0) {
            sum += n % k;
            n /= k;
        }

        return sum;
    }
    // public int sumBase(int n, int k) {
    //     return sumOfDigits(Integer.parseInt(Integer.toString(n, k)));
    // }

    // public int sumOfDigits(int num) {
    //     int sum = 0;
    //     for (int i = num; i > 0; i /= 10) {
    //         sum += i % 10;
    //     }
    //     return sum;
    // }
}
