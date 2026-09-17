package dsa.data_structures.large_numbers.understanding;

import object_oriented_programming.oop_5.interfaces.extend_demo.B;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    static void main() {
        BD();
    }

    static void BD() {
        double x = 0.03;
        double y = 0.04;
        double ans = y - x;
//        System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ANS = Y.subtract(X);
//        System.out.println(ANS);

        BigDecimal a = new BigDecimal("234567896543.4567890987654"),
                b = new BigDecimal("387656789876.67898765456789098765456");

        // Operations
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.subtract(b));
        System.out.println(b.pow(2345));

        // constants
        System.out.println(BigDecimal.TWO);
    }

    static void BI() {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(345_673_433); // converts int/long to BI
        BigInteger C = new BigInteger("2345456789098765433456789876543345678909876543345678909876543");
//        BigInteger D = BigInteger.valueOf("4567890"); --> this does not work
        BigInteger AB = BigInteger.valueOf(3),
                    X = new BigInteger("2345675678");
        int c = AB.intValue(); // BI to int

        // constants
        BigInteger D = BigInteger.ONE;

        // addition
        BigInteger sum = A.add(B);
        BigInteger prod = B.multiply(C),
                sub = C.subtract(A),
                div = C.divide(AB),
                        mod = A.remainder(AB);

        if (C.compareTo(X) < 0) { // that's how you compare
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(sum);
        System.out.println(prod);
        System.out.println(sub);
        System.out.println(div);
    }
}
