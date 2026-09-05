package dsa.searching.binary;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Peak_Index_In_A_Mountain_Array {
    static void main() {
        int[] arr = {1, 2, 3, 5, 7, 6, 3, 2};
        System.out.println("Ans: " + peakIndexInMountainArray(arr));
    }
    static public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1])
                start = mid + 1;
                // you are in ascending part of the array
                // beacuse we know that mid+1 element > mid element
            else end = mid; // you are in the descreaing part of the array
                            // it may be the answer, but look at left
                            // this is why end != mid - 1
        }
        // in the end, start == end and pointing towards the largest number because of the above two checks
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the maximum one because that is what the checks say
        // more elaboration:
        // at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining,
        // hence cuz of above line that is the best possible answer
        return start; // or return end as both are equal
    }
}
