package dsa.searching.binary.problems;


public class Ceiling_Of_A_Number {
    static void main() {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 19;
        System.out.println("The ceiling of the number is: " + getCeilingNum(arr, target));
    }
    // Finding the ceiling number else -1
    // return the smallest no. >= target
    static int getCeilingNum(int[] arr, int target) {
        if (target > arr[arr.length-1])
            return Integer.MAX_VALUE;
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == arr[mid])
                return arr[mid];
            if (arr[mid] > target)
                end = mid -1;
            else
                start = mid + 1;
        }
        return arr[start];
    }
}
