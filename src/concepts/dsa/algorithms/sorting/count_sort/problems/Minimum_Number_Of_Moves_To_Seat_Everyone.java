package concepts.dsa.algorithms.sorting.count_sort.problems;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/
public class Minimum_Number_Of_Moves_To_Seat_Everyone {
    static void main() {
        System.out.println(new Minimum_Number_Of_Moves_To_Seat_Everyone().minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4}));
    }

    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;

        for (int i = 0; i < seats.length; i++) {
            sum += Math.abs(seats[i] - students[i]);
        }

        return sum;
    }
}
