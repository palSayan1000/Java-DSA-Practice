package basic_understanding.number_pro;

import java.util.Scanner;

public class ArmsStrong_Number {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:" );
        System.out.println(checkArm(sc.nextInt()));
    }
    static boolean checkArm(int n) {
        int sum = 0;
        for(int i = n; i > 0; sum += (int)Math.pow(i % 10, 3), i /= 10);
        return sum == n;
    }
}
