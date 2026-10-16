package dsa.algorithms.prefix_sum.arrays.problems;

// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/description/
public class Sum_Of_All_Odd_Length_Subarrays {
    static void main() {
        System.out.println(new Sum_Of_All_Odd_Length_Subarrays()
                .sumOddLengthSubarrays(new int[] {1,4,2,5,3}));
    }

    public int sumOddLengthSubarrays(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }

        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((j - i + 1) % 2 == 1) {
                    totalSum += arr[j] - (i - 1 == -1 ? 0 : arr[i - 1]);
                }
            }
        }

        return totalSum;
    }
}
