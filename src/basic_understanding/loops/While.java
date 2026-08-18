package basic_understanding.loops;

public class While {
    static void main() {
        /*
            Syntax for while loop
            while (condition) {
                // body
            }
        */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        while (n != 0) {
            System.out.println(n--);
        }
        sc.close();
    }
}
