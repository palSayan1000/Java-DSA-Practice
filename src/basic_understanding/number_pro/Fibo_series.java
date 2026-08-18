package basic_understanding.number_pro;

public class Fibo_series {
    static void main() {
        // Q. Find the nth fibo number
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
        System.out.println("The nth fibo is: " + b);
    }
}
