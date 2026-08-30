package dsa.searching.binary.problems;
// https://leetcode.com/problems/search-insert-position/description/
public class Search_Insert_Position {
    static void main() {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, -1));
    }
    static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid;
        if (nums[end] < target)
            return end + 1;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < target)
                start = mid + 1;
            else end = mid;
        }
        return end;
    }
}
