package basic_understanding.data_types;

import java.util.Scanner;

public class Temperature {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        float tempC = sc.nextFloat();
        float tempF = tempC * 9 / 5 + 32;
        System.out.println("The temperature in ferenhite: " + tempF);
    }
}
