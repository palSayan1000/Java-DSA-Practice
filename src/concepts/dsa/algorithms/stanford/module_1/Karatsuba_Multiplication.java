package concepts.dsa.algorithms.stanford.module_1;

public class Karatsuba_Multiplication {
    static void main() {
        System.out.println(new Karatsuba_Multiplication().multiply("1234", "5678"));
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        return karatsuba(num1, num2);
    }

    private String karatsuba(String x, String y) {
        int n = Math.max(x.length(), y.length());

        // Base case: up to 9 digits each, product fits in long
        if (n <= 9) {
            return Long.toString(Long.parseLong(x) * Long.parseLong(y));
        }

        int m = n / 2; // length of the low half

        String a = x.length() > m ? x.substring(0, x.length() - m) : "0";
        String b = x.length() > m ? x.substring(x.length() - m) : x;
        String c = y.length() > m ? y.substring(0, y.length() - m) : "0";
        String d = y.length() > m ? y.substring(y.length() - m) : y;

        String ac = karatsuba(a, c);
        String bd = karatsuba(b, d);
        String abcd = karatsuba(add(a, b), add(c, d));

        String mid = sub(sub(abcd, ac), bd);   // AD + BC

        return add(add(shift(ac, 2 * m), shift(mid, m)), bd);
    }

    private String shift(String s, int k) {
        return s.equals("0") ? "0" : s + "0".repeat(k);
    }

    private String add(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return strip(sb.reverse().toString());
    }

    // assumes a >= b
    private String sub(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, borrow = 0;
        while (i >= 0) {
            int diff = (a.charAt(i--) - '0') - borrow;
            if (j >= 0) diff -= b.charAt(j--) - '0';
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else borrow = 0;
            sb.append(diff);
        }
        return strip(sb.reverse().toString());
    }

    private String strip(String s) {
        int k = 0;
        while (k < s.length() - 1 && s.charAt(k) == '0') k++;
        return s.substring(k);
    }
}