package dsa.searching.binary;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class Find_First_And_Last_Position_Of_Element_In_Sorted_Array {
    static void main() {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println("The result: " + Arrays.toString(searchRange(arr, target)));
    }
        // Kunal's Solution
    static public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = binarySearch(nums, target, true);
        int end = binarySearch(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int binarySearch(int[] nums, int target, boolean flag) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
                ans = mid;
                if (flag)
                    end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
//    // My solution
//    static public int[] searchRange(int[] nums, int target) {
//        int possibleAns = binarySearch(nums, target, 0, nums.length - 1, 0);
////        int start = binarySearch(nums, target, 0, possibleAns - 1, -1);
////        int end = binarySearch(nums, target, possibleAns + 1, nums.length - 1, 1);
//        return possibleAns == -1 ? new int[]{-1, -1} :
//                new int[]{binarySearch(nums, target, 0, possibleAns - 1, -1)/*start*/,
//                        binarySearch(nums, target, possibleAns + 1, nums.length - 1, 1)/*end*/};
//    }
//    static int binarySearch(int[] nums, int target, int start, int end, int flag) {
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (nums[mid] == target)
//                switch (flag) {
//                    case -1 ->  end = mid - 1;
//                    case 1 -> start = mid + 1;
//                    default -> {return mid;}
//                }
//            else if (nums[mid] > target)
//                end = mid - 1;
//            else
//                start = mid + 1;
//        }
//        return switch (flag) {
//            case -1 -> start;
//            case 1 -> end;
//            default -> -1;
//        };
//    }
}
