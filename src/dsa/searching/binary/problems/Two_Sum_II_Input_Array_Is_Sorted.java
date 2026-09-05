package dsa.searching.binary.problems;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=problem-list-v2&envId=binary-search
public class Two_Sum_II_Input_Array_Is_Sorted {
    static void main() {
        System.out.println(java.util.Arrays.toString(new Two_Sum_II_Input_Array_Is_Sorted().twoSum(new int[] {2, 7, 11, 15}, 9)));
    }
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start < end && numbers[start] + numbers[end] != target) {
//            int mid = start + (end - start) / 2;
            if (numbers[start] + numbers[end] > target)
                end --;
            if (numbers[start] + numbers[end] < target)
                start ++;
        }
        return new int[] {start + 1, end + 1};
    }
}
