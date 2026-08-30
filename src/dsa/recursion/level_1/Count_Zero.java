package dsa.recursion.level_1;

public class Count_Zero {
    static void main() {
        System.out.println(countZero(30204));
    }
    static int countZero(int n) {
        if (n == 0)
            return 0;
        return countZero(n / 10) + (n % 10 == 0? 1 : 0);
    }
}
