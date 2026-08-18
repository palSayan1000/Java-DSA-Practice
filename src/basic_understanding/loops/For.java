package basic_understanding.loops;

public class For {
    static void main() {
        /*
            For loop syntax
            for (initialization; condition; increment/decrement) {
                // body
            }
        */

        // Q: print numbers from 1 to 5
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
        // printing numbers from 1 to n
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i + "\t");
        }
        sc.close();
    }
}
