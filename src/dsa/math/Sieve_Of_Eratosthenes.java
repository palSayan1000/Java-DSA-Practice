package dsa.math;

public class Sieve_Of_Eratosthenes {
    static void main() {
        int n = 60;
        boolean[] primes = new boolean[n + 1];
        sieve(n, primes);
        int countPrimes = 0;
        for (boolean i: primes)
            if (!i) countPrimes++;
        System.out.println("The total no of primes: " + countPrimes);
    }
    // false in array means number is prime and vise versa
    static void sieve(int n, boolean[] primes) {
        primes[0] = primes[1] = true;
        for (int i = 2; i * i <= n; i++)
            if (!primes[i])
                for (int j = i * i; j <= n; j += i)
                    primes[j] = true;
    }
}
