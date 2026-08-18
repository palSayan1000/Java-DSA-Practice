package basic_understanding.functions_methods;

import java.util.Scanner;

import static java.lang.IO.*;

public class Return_Sum {
    public static void main(String[] args) {
        int sum = sum();
        println("The Sum = " + sum);
    }

    static int sum() {
        Scanner sc = new Scanner(System.in);
        print("Enter the two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        return a + b;
        // System.out.println("This will never excute");
    }
    /*
    return_type name () {
         // body
         return statement;
    }
    */
}
