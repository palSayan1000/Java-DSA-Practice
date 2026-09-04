package dsa.recursion.problems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combinations/description/?envType=problem-list-v2&envId=dbe72sy1
public class Combinations {
    static void main() {
        System.out.println(new Combinations().combine(4, 2));
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        generateCombo(n, 1, k, new ArrayList<>(), list);
        return list;
    }
    public void generateCombo(int n, int index, int k, List<Integer> lst, List<List<Integer>> list) {
        if (k == 0) {
            list.add(new ArrayList<>(lst));
            return;
        }
        for (int i = index; i <= n; i++) {
            lst.add(i);
            generateCombo(n, i + 1, k - 1, lst, list);
            lst.removeLast();
        }
    }
}
