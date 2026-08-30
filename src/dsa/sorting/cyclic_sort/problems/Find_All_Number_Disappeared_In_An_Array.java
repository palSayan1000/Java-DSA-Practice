package dsa.sorting.cyclic_sort.problems;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class Find_All_Number_Disappeared_In_An_Array {
    static void main() {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] - 1 != i && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
                i--;
            }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            if (i + 1 != nums[i])
                list.add(i + 1);
        return list;
    }
}
