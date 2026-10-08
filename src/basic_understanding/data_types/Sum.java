package basic_understanding.data_types;

public class Sum {
    static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the two numbers respectively: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        System.out.println("The sum of two numbers: " + (num1 + num2));
    }
}
