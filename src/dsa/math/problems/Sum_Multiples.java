package dsa.math.problems;
// https://leetcode.com/problems/sum-multiples/description/?envType=problem-list-v2&envId=prshgx6i
public class Sum_Multiples {
    static void main() {
        System.out.println(new Sum_Multiples().sumOfMultiples(10));
    }
    int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i ++)
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                sum += i;
        return sum;
    }
}
