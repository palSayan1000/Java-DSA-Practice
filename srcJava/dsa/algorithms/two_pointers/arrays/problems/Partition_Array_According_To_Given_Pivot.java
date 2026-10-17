package dsa.algorithms.two_pointers.arrays.problems;

// https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
public class Partition_Array_According_To_Given_Pivot {
    static void main() {
        System.out.println(java.util.Arrays.toString(new Partition_Array_According_To_Given_Pivot()
                .pivotArray(new int[]{9, 12, 5, 10, 14, 3, 10}, 10)));
    }

    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int i = 0, j = nums.length - 1;

        for (int k = 0, r = nums.length - 1; k < nums.length; k++, r--) {
            if (nums[k] < pivot) {
                arr[i++] = nums[k];
            }
            if (nums[r] > pivot) {
                arr[j--] = nums[r];
            }
        }
        while (i <= j) {
            arr[i++] = pivot;
        }

        return arr;
    }
}
