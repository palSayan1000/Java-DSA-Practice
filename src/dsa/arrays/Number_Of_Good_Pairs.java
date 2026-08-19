package dsa.arrays;
//https://leetcode.com/problems/number-of-good-pairs/description/
public class Number_Of_Good_Pairs {
    static void main() {
        System.out.println(numIdenticalPairs(new int[] {1,2,3,1,1,3}));
    }
    static public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        for(int i : nums)
            freq[i]++;
        int sum = 0;
        for(int i : freq)
            sum += i * -- i / 2;
        return sum;
    }
}
