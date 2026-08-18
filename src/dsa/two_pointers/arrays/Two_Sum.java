package dsa.two_pointers.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Two_Sum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of tha array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; array[i++] = sc.nextInt()) {
        }
        System.out.println("Enter the target number: ");
        int target = sc.nextInt();
        int[] ans = new Two_Sum().twoSum(array, target);
        System.out.println("The two sum number is " + ans[0] + " and " + ans[1]);
        System.out.println("The array: " + Arrays.toString(ans));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            if (map.containsKey(target - nums[i])) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return ans;
            } else
                map.put(nums[i], i);
        return ans;
    }
}
