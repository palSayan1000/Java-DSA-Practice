package concepts.dsa.data_structures.heaps.problems.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// https://leetcode.com/problems/sort-characters-by-frequency/description/
public class Sort_Characters_By_Frequency {

    static void main() {
        System.out.println(new Sort_Characters_By_Frequency().frequencySort("tree"));
    }
//    public String frequencySort(String s) {
//        char[] charArray = s.toCharArray();
//
//        int[] freq = computeFreq(s, charArray);
//        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a, b) -> freq[b] - freq[a] == 0 ? b - a : freq[b] - freq[a]);
//
//        for (char ch : charArray) {
//            priorityQueue.offer(ch);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        while (!priorityQueue.isEmpty()) {
//            sb.append(priorityQueue.poll());
//        }
//
//        return sb.toString();
//    }

    public String frequencySort(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pqueue = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        pqueue.addAll(freqMap.entrySet());
        StringBuilder sb = new StringBuilder();

        while (!pqueue.isEmpty()) {
            Map.Entry<Character, Integer> set = pqueue.poll();
            sb.repeat(String.valueOf(set.getKey()), Math.max(0, set.getValue()));
        }

        return sb.toString();
    }

    private int[] computeFreq(String s, char[] charArray) {
        int[] freq = new int[256];

        for (char i : charArray) {
            freq[i]++;
        }

        return freq;
    }
}
