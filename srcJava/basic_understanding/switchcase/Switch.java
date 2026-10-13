package basic_understanding.switchcase;

import java.util.Scanner;

public class Switch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the fruit: ");
        String fruit = sc.next();
        /*
            In switch statements you can to various cases based on your expression
            Syntax:
            switch (expression) {               Note:
                //cases                         -case has to be same type as expression, must be a constant or literal
                case one:                       -duplicate case values are not allowed
                    // do something             -break is used to terminate the sequence
                    break                       -if break is not used it will continue to next case resulting in fall through
                case two:                       -default will execute when none of the above does
                    // do something             -if default is not at the end, put brak after it
                    break;
                default:
                    // do something
        */
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits.");
                break;
            case "Apple":
                System.out.println("A sweet red fruit.");
                break;
            case "Orange":
                System.out.println("Round fruit.");
                break;
            case "Grape":
                System.out.println("Small sweet fruit.");
                break;
            default:
                System.out.println("Invalid fruit");
        }
    }
}
