package dsa.arrays;
//https://leetcode.com/problems/richest-customer-wealth/
public class Richest_Customer_Wealth {
    public static void main() {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        System.out.println("The maximum wealth: " + new Richest_Customer_Wealth().maximumWealth(arr));
    }
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] i : accounts) {
            int sum = 0;
            for(int j : i)
                sum += j;
            max = Math.max(sum, max);
        }
        return max;
    }
}
