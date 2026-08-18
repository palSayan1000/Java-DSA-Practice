package dsa.searching.binary;

public class Order_Agnostic_Binary_Search {
    static void main() {
        //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 18, 12, 6, 4, 3, 1, -2, -17, -293847};
        int target = -2;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1, flag = arr[0] > arr[arr.length - 1] ? -1 : 1;
        // using flag stored is it descending or ascending
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (flag == -1){
                if (arr[mid] < target)
                    end = mid - 1;
                else
                    start = mid + 1;
                continue;
            }
            if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
