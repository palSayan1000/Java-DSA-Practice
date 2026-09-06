package dsa.math.problems;

// https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/?envType=problem-list-v2&envId=prshgx6i
public class Count_The_Digits_That_Divide_A_Number {
    static void main() {
        var obj = new Count_The_Digits_That_Divide_A_Number();
        System.out.println(obj.countDigits(121));
        System.out.println(obj.countDigits(7));
        System.out.println(obj.countDigits(1248));
    }
    public int countDigits(int num) {
        int copyNum = num, countDigits = 0;
        while (copyNum > 0) {
            countDigits += num % (copyNum % 10) == 0? 1 : 0;
            copyNum /= 10;
        }
        return countDigits;
    }
}
