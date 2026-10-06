package concepts.dsa.data_structures.strings;

// https://leetcode.com/problems/string-to-integer-atoi/description/
public class String_to_Integer_atoi {
    static void main() {
        System.out.println(new String_to_Integer_atoi().myAtoi("Sayan Pal Bitch!!!"));
    }

    public int myAtoi(String s) {
        if (s.isBlank()) {
            return 0;
        }
        s = s.trim();
        int sign = getSign(s.charAt(0));
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            s = s.substring(1);
        }
        long num = 0;

        for (char ch : s.toCharArray()) {
            if (!Character.isDigit(ch)) {
                break;
            }
            num = num * 10 + (ch - 48);

            if (num * sign > Integer.MAX_VALUE
                    || num * sign < Integer.MIN_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }

        return (int) num * sign;
    }

    public int getSign(char ch) {
        return switch (ch) {
            case '-' -> -1;
            default -> 1;
        };
    }
}
