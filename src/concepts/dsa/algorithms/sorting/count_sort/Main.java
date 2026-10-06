package concepts.dsa.algorithms.sorting.count_sort;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    static void main() {
        int[] arr = {3, 5, 10, 6, 3, 10, 9, 6};
        System.out.println(Arrays.toString(arr));
        countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }

    // array elements should be ve+
    public static void countSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int maxEle = 0;
        for (int i : array) {
            maxEle = Math.max(i, maxEle);
        }

        int[] freq = new int[maxEle + 1];
        for (int i : array) {
            freq[i]++;
        }

        for (int i = 0, index = 0; i <= maxEle; i++) {
            while (freq[i] > 0) {
                array[index++] = i;
                freq[i]--;
            }
        }
    }

    // this can handle negative numbers
    // count sort using hashmaps -> bad approach
    public static void countSortHash(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int maxEle = Arrays.stream(array).max().getAsInt();
        int minEle = Arrays.stream(array).min().getAsInt();

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i : array) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        int index = 0;
        for (int i = minEle; i <= maxEle; i++) {
            int count = countMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                array[index] = i;
                index++;
            }
        }
    }
}
