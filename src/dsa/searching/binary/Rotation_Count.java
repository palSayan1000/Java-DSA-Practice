package dsa.searching.binary;

public class Rotation_Count {
    static void main() {
        int[] arr = {4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2};
        System.out.println("Total rotaions: " + countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        return findPivot(arr) + 1;
    }

    private static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid + 1 < arr.length && arr[mid] > arr[mid + 1])
                return mid;
            if (mid - 1 >= 0 && arr[mid - 1] > arr[mid])
                return mid - 1;
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1])
                    return start;
                start ++;
                if (arr[end] < arr[end - 1])
                    return end - 1;
                end --;
            } else if (arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end]))
                start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
