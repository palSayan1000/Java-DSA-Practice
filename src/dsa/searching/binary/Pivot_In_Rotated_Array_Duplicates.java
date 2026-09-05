package dsa.searching.binary;

public class Pivot_In_Rotated_Array_Duplicates {
    static int findPivotWithDuplicates(int[] arr) {
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

            // elements at the middle, start and the end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // Note : what if the elements at the start and end were the pivots ???
                // check iif start is pivot
                if (arr[start] > arr[start + 1])
                    return start;
                // check if end is pivot
                if (arr[end] < arr[end - 1])
                    return end - 1;
                start ++;
                end --;
            }
            // left side is sorted so, pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
                start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    static void main() {

    }
}
