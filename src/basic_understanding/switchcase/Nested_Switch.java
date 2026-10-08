package basic_understanding.switchcase;

import java.util.Scanner;

public class Nested_Switch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee ID: ");
        int empID = sc.nextInt();
        System.out.println("Enter the department: ");
        String department = sc.next();
//        switch (empID) {
//            case 1 -> System.out.println("Sayan Pal");
//            case 2 -> System.out.println("Radhe Rahde");
//            case 3 -> System.out.println(switch(department) {
//                case "IT" -> "IT Department";
//                case "Management" -> "Managemennt Department";
//                default -> "Unknown Department";
//            });
//            default -> System.out.println("Unknown ID");
//        }
        System.out.println(switch (empID) {
            case 1 -> "Sayan Pal";
            case 2 -> "Radhe Rahde";
            case 3 -> switch (department) {
                case "IT" -> "IT Department";
                case "Management" -> "Managemennt Department";
                default -> "Unknown Department";
            };
            default -> "Unknown ID";
        });
    }
}
