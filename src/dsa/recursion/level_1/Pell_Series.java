package dsa.recursion.level_1;

public class Pell_Series {
    static void main() {
        System.out.println("The no.of terms to print: ");
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println("The pell series: ");
//        series(n);
        for (int i = 0; i <= n; i++)
            System.out.print(series(i) + "\t");
    }
    static int series(int n) {
        return (int) Math.round((Math.pow(1 + Math.sqrt(2), n) - Math.pow(1 - Math.sqrt(2), n)) / (2 * Math.sqrt(2)));
    }
//    static int series(int n) {
//        if (n < 2)
//            return n;
//        return 2 * series(n - 1) + series(n - 2);
//    }
//    static void series(int n) {
//        int a = 0, b = 1, c;
//        System.out.printf("%d\t%d\t", a, b);
//        while (n-- > 0) {
//            c = a + b * 2;
//            System.out.print(c + "\t");
//            a = b;
//            b = c;
//        }
//        System.out.println();
//    }
}
