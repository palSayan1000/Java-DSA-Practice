package basic_understanding.functions_methods;

import java.util.Scanner;

import static java.lang.IO.println;

public class Print_Sum {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        println("Enter the two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        println("The Sum: " + (a + b));
        sc.close();
    }
    /*
    return_type name () {
         // body
         return statement;
    }
    */
}
