package dsa.math.problems;

import java.util.Scanner;

// https://leetcode.com/problems/count-primes/description/
public class Count_Primes {
    static int countPrimes(int n) {
        if (n <= 2) return 0;
        return sieve(new boolean[n]);
    }
    static int sieve(boolean[] primes) {
        int countNonPrimes = 0;
        for (int i = 2; i * i < primes.length; i++)
            if (!primes[i])
                for (int j = i * i; j < primes.length; j += i) {
                    if (!primes[j]) countNonPrimes++;
                    primes[j] = true;
                }
        return primes.length - countNonPrimes - 2;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The total primes: " + countPrimes(n));
    }
}
