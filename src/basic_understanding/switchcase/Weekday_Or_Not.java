package basic_understanding.switchcase;

public class Weekday_Or_Not {
    public static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the day no. : ");
        int day = sc.nextInt();
//        switch (day) {
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Weekday");
//                break;
//            case 7:
//            case 1:
//                System.out.println("Weekend");
//                break;
//            default :
//                System.out.println("\033[1;31mout of bounds bitch don't know how many days in a week!\033[0m");
//        }
        switch (day) {
            case 2, 3, 4, 5, 6 -> System.out.println("Weeday");
            case 7, 1 -> System.out.println("Weekend");
            default -> System.out.println("\033[1;31mout of bounds bitch don't know how many days in a week!\033[0m");
        }
    }
}
