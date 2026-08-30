package dsa.recursion.level_1;

public class Locus_Series {
    static void main() {
        System.out.println("The no.of terms to print: ");
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println("The Locus Series: ");
//        series(n);
        for (int i = 0; i <= n; i++)
            System.out.print(locus_series(i) + "\t");
    }
    static int locus_series(int n) {
        return (int) Math.round(Math.pow((1 + Math.sqrt(5)) / 2, n) + Math.pow((1 - Math.sqrt(5)) / 2, n));
    }
//    static int locus_series(int n) {
//        if (n == 0) return 2;
//        if (n == 1) return 1;
//        return locus_series(n - 1) + locus_series(n - 2);
//    }
//    static void locus_series(int n) {
//
//    }
}
