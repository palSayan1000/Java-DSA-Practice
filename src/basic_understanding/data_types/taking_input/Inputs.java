package basic_understanding.data_types.taking_input;

import java.util.Scanner;

public class Inputs {
    static void main() {
        Scanner input = new Scanner(System.in);
        // Integer Input
        IO.print("Enter your roll no.: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is: " + rollno);
        // int a = 230_000_001;
        // String input
        System.out.println("Enter your first and full name respectively: ");
        String firstName = input.next();
        input.nextLine();
        String fullName = input.nextLine();
        System.out.println("Your first name is: " + firstName);
        System.out.println("Your full name is: " + fullName);
        // float input
        IO.println("Enter a floating point number: ");
        float num = input.nextFloat();
        System.out.println("Your floating point number is: " + num);
        // double input
        IO.println("Enter a double point number: ");
        double num2 = input.nextDouble();
        System.out.println("Your double point number is: " + num2);
        // boolean input
        IO.println("Enter true/false: ");
        boolean bool = input.nextBoolean();
        System.out.println("Your boolean value is: " + bool);
        // long input
        System.out.println("Enter a long integer: ");
        long longInt = input.nextLong();
        System.out.println("Your long value is: " + longInt);
        // byte input
        // -128 <= x <= 127
        System.out.println("Enter your byte integer: ");
        byte byteInt = input.nextByte();
        System.out.println("Your byte value is : " + byteInt);
        // short input
        IO.println("Enter a short integer: ");
        short shortInt = input.nextShort();
        // Minimum value: -32,768
        // Maximum value: 32,767
        System.out.println("Your short value is: " + shortInt);
    }
}
