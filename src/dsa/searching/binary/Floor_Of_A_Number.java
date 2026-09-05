package dsa.searching.binary;


public class Floor_Of_A_Number {
    static void main() {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println("The ceiling of the number is: " + getFloorNum(arr, target));
    }
    // grestest number that is smaller or equal to target
    static int getFloorNum(int[] arr, int target) {
        if (target < arr[0])
            return Integer.MIN_VALUE; // since at last end will be -1
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return arr[mid];
            if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return arr[end];
    }
}
