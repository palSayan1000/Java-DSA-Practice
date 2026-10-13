package dsa.data_structures.large_numbers.understanding;

import java.math.BigInteger;

public class Factorial {
    static BigInteger fact(String num) {
        BigInteger prod = BigInteger.valueOf(1),
                limit = new BigInteger(num);

        for (BigInteger i = BigInteger.ONE; i.compareTo(limit) <= 0/* continues till i less than limit*/;
             i = i.add(BigInteger.ONE)) {
            prod = prod.multiply(i);
        }

        return prod;
    }

    static void main() {
        System.out.println(fact("523"));
    }
}
