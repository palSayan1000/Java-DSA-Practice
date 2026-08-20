package dsa.searching.binary.problems;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class Rotated_Binary_Search {
    static void main() {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // if you do not find a pivot dust do normal binary search
        if (pivot == -1)
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        if (nums[pivot] == target)
            return pivot;
        // if pivot is found u have found two ascending sorted arrays
        int firstHalf = binarySearch(nums, target, 0, pivot - 1);
        if (firstHalf != -1)
            return firstHalf;
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    // this will not work for duplicate values
    static int findPivot(int[] arr) {
        if (arr.length == 0 || arr[0] < arr[arr.length - 1])
            return -1;
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            // case 1:
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            // case 2:
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            // case 3:
            if (arr[mid] <= arr[start])
                end = mid - 1;
            else // case 4:
                start = mid + 1;
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target)
                end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
