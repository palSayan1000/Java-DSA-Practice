package dsa.searching.binary.problems;

public class Valid_Perfect_Square {
    static void main() {
        System.out.println("Is Valid Perfect Square?: " + isPerfectSquare(17));
    }
    static boolean isPerfectSquare(int x) {
        if (x == 1) return true;
        int start = 0, end = x - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((long)mid * mid <= (long)x)
                start = mid + 1;
            else end = mid - 1;
        }
        return end * end == x;
    }
}
