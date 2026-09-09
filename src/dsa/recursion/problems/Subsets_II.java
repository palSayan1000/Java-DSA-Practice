package dsa.recursion.problems;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Subsets_II {
    static void main() {
        System.out.println(new Subsets_II().subsetsWithDup(new int[] {4,4,4,1,4}));
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        generateUniqueSubsets(nums, 0, new ArrayList<>(), list, set);
        return(list);
    }
    public void generateUniqueSubsets(int[] nums, int index, ArrayList<Integer> lst, List<List<Integer>> list, HashSet<List<Integer>> set) {
        if (index == nums.length) {
            if (set.add(lst))
                list.add(new ArrayList<>(lst));
            return;
        }
        generateUniqueSubsets(nums, index + 1, lst, list, set);
        lst.add(nums[index]);
        generateUniqueSubsets(nums, index + 1, lst, list, set);
        lst.removeLast();
    }
}
