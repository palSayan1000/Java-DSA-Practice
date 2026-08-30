package basic_understanding.patterns;

public class Pattern_31 {
    public static void main(String[] args) {
        print();
    }
    static void print() {
        int n = 4;
        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j <= n * 2; j++) {
                int atEveryIndex = n - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
