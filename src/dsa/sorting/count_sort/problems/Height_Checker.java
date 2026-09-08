package dsa.sorting.count_sort.problems;

public class Height_Checker {
    static void main() {
        System.out.println(new Height_Checker().heightChecker(new int[] {1,1,4,2,1,3}));
    }
    public int heightChecker(int[] heights) {
        if (heights.length <= 1)
            return 0;
        int[] freq = new int [101];
        int discrepancyCount = 0;
        for (int i : heights)
            freq[i] ++;
        for (int i = 1, k = 0; k < heights.length; i++){
            while (freq[i] != 0) {
                if (i != heights[k ++])
                    discrepancyCount ++;
                freq[i] --;
            }
        }
        return discrepancyCount;
    }
}
