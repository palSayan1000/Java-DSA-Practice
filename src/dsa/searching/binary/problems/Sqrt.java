package dsa.searching.binary.problems;

public class Sqrt {
    static void main() {
        System.out.println("The square root: " + mySqrt(8));
    }
    static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int start = 0, end = x - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long)mid * mid <= (long)x)
                start = mid + 1;
            else end = mid - 1;
        }
        return end;
    }
}
