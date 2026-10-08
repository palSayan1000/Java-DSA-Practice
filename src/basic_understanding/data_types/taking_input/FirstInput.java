package basic_understanding.data_types.taking_input;

import java.util.Scanner;

// import java.util.*; // importing everything in the util class
public class FirstInput {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
        System.out.println(input.next());
        System.out.println(input.nextLine());
    }
}
