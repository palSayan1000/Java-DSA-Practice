package dsa.recursion.level_2_array;

public class IsSortedArr {
    static void main() {
        int[] arr = {1, 2, 0, 8, 9, 12};
        System.out.println(isSorted(arr, 1));
    }
    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length) return true;
        return arr[index] >= arr[index - 1] && isSorted(arr, index + 1);
    }
}
