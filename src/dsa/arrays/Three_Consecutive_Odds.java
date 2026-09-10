package dsa.arrays;

public class Three_Consecutive_Odds {
    static void main() {
        System.out.println(new Three_Consecutive_Odds().threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 2, 23, 2, 12}));
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        int consecutiveOddCount = 0;
        for (int i : arr)
            if ((i & 1) == 1)
                consecutiveOddCount++;
            else if ((i & 1) == 0)
                if (consecutiveOddCount >= 3)
                    return true;
                else consecutiveOddCount = 0;
        return consecutiveOddCount >= 3;
    }
}
