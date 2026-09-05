package dsa.searching.binary;

//https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
public class Searching_In_Infinite_Array {
    public static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target) {
                start = mid + 1;
            }else if(arr[mid] > target)
                end = mid - 1;
        }
        return -1;
    }
    public static int findingRange(int[] arr, int target) {
        // first find the range
        // first start with  a box of 2 size
        int start = 0, end = 1;
        while (true) try {
            while (target > arr[end]) {
                int temp = end;
                end = (end - start + 1) * 2 + end;
                start = temp;
            }
            break;
        } catch (ArrayIndexOutOfBoundsException e) {
            end = start + 1;
        }
        return search(arr, target, start, end);
    }
    static void main() {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findingRange(arr, target));
    }
}
