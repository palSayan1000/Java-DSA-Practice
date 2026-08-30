package dsa.math.problems;
// https://leetcode.com/problems/add-digits/description/
public class Add_Digits {
    static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("The result: " + new Solution().addDigits(n));
    }
}

class Solution {
    public int addDigits(int num) {
        if (num < 10)
            return num;
        int sum = 0;
        for (int i = num; i > 0; sum += i % 10, i /= 10) ;
        return addDigits(sum);
    }
    // if(num == 0){
    //      return 0;
    //  }
    //
    // return 1 + (num -1) % 9;
}