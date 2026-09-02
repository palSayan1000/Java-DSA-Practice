package dsa.sorting.count_sort.problems;

public class Relative_Sort_Array {
    static void main() {
        System.out.println(java.util.Arrays.toString(new Relative_Sort_Array().relativeSortArray(new int[] {2,3,1,3,2,4,6,7,9,2,19},
                new int[] {2,1,4,3,9,6})));
    }
    int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq;
        int maxSize = 0, k = 0;
        for (int i: arr1)
            maxSize = Math.max(i, maxSize);
        freq = new int[maxSize + 1];
        for (int i: arr1)
            freq[i] ++;
        for (int i: arr2)
            while (freq[i] > 0) {
                arr1[k++] = i;
                freq[i]--;
            }
        for (int i = 0; i <= maxSize; i++)
            while (freq[i] > 0) {
                arr1[k++] = i;
                freq[i]--;
            }
        return arr1;
    }
}
