package dsa.data_structures.large_numbers.understanding;

import java.math.BigInteger;

public class Multiply_Strings {
    static void main() {
        System.out.println(new Multiply_Strings().multiply("2", "3"));
    }

    public String multiply(String num1, String num2) {
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        return number1.multiply(number2).toString();
    }
}
