package dsa.arrays;

//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/?envType=problem-list-v2&envId=prshgx6i
public class Difference_Between_Element_Sum_And_Digit_Sum_Of_An_Array {
    static void main() {
        System.out.println(new Difference_Between_Element_Sum_And_Digit_Sum_Of_An_Array().differenceOfSum(new int[]{1, 2, 3, 4}));
    }

    public int differenceOfSum(int[] nums) {
        int digitSum = 0, elementSum = 0;
        for (int i : nums) {
            digitSum += sumOfDigits(i);
            elementSum += i;
        }
        return Math.abs(digitSum - elementSum);
    }

    public int sumOfDigits(int num) {
        if (num < 10) return num;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
