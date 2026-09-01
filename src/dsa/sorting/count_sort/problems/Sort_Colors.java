package dsa.sorting.count_sort.problems;

public class Sort_Colors {
    static void main() {
        int[] nums = {2,0,2,1,1,0};
        new Sort_Colors().sortColors(nums);
        System.out.println(java.util.Arrays.toString(nums));
    }
    void sortColors(int[] nums) {
        int[] freq = new int[3];
        for (int n : nums)
            freq[n]++;
        for (int i = 0, j = 0; i < nums.length; i++) {
            nums[i] = freq[j] > 0 ? j : ++j;
            freq[nums[i]]--;
        }
    }
}
