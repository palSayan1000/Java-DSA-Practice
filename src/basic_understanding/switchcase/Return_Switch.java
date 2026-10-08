package basic_understanding.switchcase;

import java.util.Scanner;

public class Return_Switch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int num = sc.nextInt();
        System.out.println("The day: " + printDay(num));
    }

    static String printDay(int day) {
        return switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "\033[1;31mout of bounds bitch don't know how many days in a week!\033[0m";
        };
    }
}
