package dsa.searching.binary.problems;

// https://leetcode.com/problems/find-peak-element/description/
public class Find_Peak_Element {
    static int findPeakElement(int[] arr) {
        int start = 0, end = arr.length - 1, mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1])
                start = mid + 1;
            else end = mid;
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
    }
}
