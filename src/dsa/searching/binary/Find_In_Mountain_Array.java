package dsa.searching.binary;
// https://leetcode.com/problems/find-in-mountain-array/description/
public class Find_In_Mountain_Array {

    public interface MountainArray {
        int get(int index);
        int length();
    }

    public static class Impl implements MountainArray {
        private final int[] arr;

        public Impl(int[] arr) {
            this.arr = arr;
        }

        @Override
        public int get(int index) {
            return arr[index];
        }

        @Override
        public int length() {
            return arr.length;
        }
    }

    // Write your solution logic inside this method
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = findPeakElement(mountainArr);
        int firstHalf = binarySearch(mountainArr, target, 0, peakIndex, true);
        if (firstHalf != -1)
            return firstHalf;
        // search in the second half
        return binarySearch(mountainArr, target, peakIndex + 1, mountainArr.length() - 1, false);
    }
    int findPeakElement(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) < arr.get(mid + 1))
                start = mid + 1;
            else end = mid;
        }
        return end;
    }
    // order agnostic binary search
    int binarySearch(MountainArray arr, int target, int start, int end, boolean flag) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == target)
                return mid;
            if (flag) {
                if (arr.get(mid) < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (arr.get(mid) > target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Find_In_Mountain_Array solver = new Find_In_Mountain_Array();

        // 1. Instantiate using the concrete Impl class
        MountainArray mountainArr = new Impl(new int[]{1, 2, 3, 4, 5, 3, 1});
        int target = 3;

        // 2. Pass target and mountainArr arguments
        int result = solver.findInMountainArray(target, mountainArr);
        System.out.println(result);
    }
}