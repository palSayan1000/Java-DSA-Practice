package basic_understanding.functions_methods;

public class Parameters {
    static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        System.out.println("The sum: " + sum(sc.nextInt(), sc.nextInt()));
    }

    // passinf parameters
    static int sum(int a, int b) {
        return a + b;
    }
}
