package dsa.data_structures.hashmap.problems.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    static void main() {
        System.out.println(new Group_Anagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> set = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String st = new String(chars);
            if (!set.containsKey(st)) {
                set.put(st, new ArrayList<>());
            }
            set.get(st).add(str);
        }

        return new ArrayList<>(set.values());
    }
}
