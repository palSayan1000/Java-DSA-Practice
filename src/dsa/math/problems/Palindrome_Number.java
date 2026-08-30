package dsa.math.problems;
// https://leetcode.com/problems/palindrome-number/description/
public class Palindrome_Number {
    public static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Is It A Palindrome Number: " + new Palindrome_Number().isPalindrome(num));
    }

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        long n = 0, num = x;
        while (num > 0) {
            n = n * 10 + num % 10;
            num /= 10;
        }
        return n == x;
    }
}
