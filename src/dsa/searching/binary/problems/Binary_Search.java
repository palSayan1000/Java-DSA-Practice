package dsa.searching.binary.problems;

//https://leetcode.com/problems/binary-search/description/
public class Binary_Search {
    static void main() {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = -18;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        binarySearch_loop:
        while (start <= end) {
            int mid = start + (end - start) / 2; // this is the better way to do
            // finding the middle element
            // mid = (start + end) / 2 // this will get out of integer size
            // might be possible that (start + end) exceeds the range of integers in java
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target) {
                start = mid + 1;
                continue;
            }
            if(arr[mid] > target)
                end = mid - 1;
        }
        return -1;
    }
}
