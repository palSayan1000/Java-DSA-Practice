package dsa.searching.linear;

public class LinearSearch {
    static void main() {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    // search in the array -> return the index if item found else -1.
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0)
            return -1;
        // run for loop
        for(int index = 0; index < arr.length; index++)
            if(arr[index] == target)
                return index;
        // if not return executed so it means target not found
        return -1; // element not found
    }
    // search the target and return element itself
    static int linearSearch2(int[] arr, int target){
        for(int i : arr) // here if check is not required it is returndent
            if(i == target)
                return i;
        return Integer.MAX_VALUE;
    }
    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target){
        for(int i : arr)
            if(i == target)
                return true;
        return false;
    }
}
