package dsa.math.problems;
// https://leetcode.com/problems/closest-prime-numbers-in-range/
public class Closest_Prime_Numbers_In_Range {
    static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the range: ");
        System.out.println("The closest prime number is " + java.util.Arrays.toString(closestPrimes(sc.nextInt(), sc.nextInt())));
    }
    static int[] closestPrimes(int startRange, int endRange) {
        if (startRange >= endRange || endRange <= 2) return new int[]{-1, -1};
        boolean[] primes = new boolean[endRange + 1];
        sieve(primes);
        int[] ans = new int[2];
        int previousPrime = -1;
        ans[0] = ans[1] = -1;
        for (int i = startRange; i <= endRange; i++)
            if (!primes[i]) {
                if (previousPrime == -1)
                    ans[ans[0] == -1 ? 0 : 1] = i;
                if (ans[1] - ans[0] > i - previousPrime) {
                    ans[0] = previousPrime;
                    ans[1] = i;
                }
                if (ans[1] != -1)
                    previousPrime = i;
            }
        if (ans[1] == -1)
            ans[0] = -1;
        return ans;
    }
    // false means prime and vise-versa
    static void sieve(boolean[] primes) {
        primes[0] = primes[1] = true;
        for (int i = 2; i * i < primes.length; i++)
            if (!primes[i])
                for (int j = i * i; j < primes.length; j += i)
                    primes[j] = true;
    }
}
