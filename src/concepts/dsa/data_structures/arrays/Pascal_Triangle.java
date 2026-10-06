package concepts.dsa.data_structures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/description/
public class Pascal_Triangle {
    static void main() {
        System.out.println(new Pascal_Triangle().generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) {
            return list;
        }
        list.add(new ArrayList<>(Arrays.asList(new Integer[]{1})));

        for (int i = 1; i < numRows; i++) {
            List<Integer> lst = new ArrayList<>();
            lst.add(1);
            for (int j = 1; j < list.getLast().size(); j++) {
                lst.add(list.getLast().get(j - 1) + list.getLast().get(j));
            }
            lst.add(1);
            list.add(lst);
        }

        return list;
    }
}
