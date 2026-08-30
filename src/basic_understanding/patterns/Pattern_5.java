package basic_understanding.patterns;

public class Pattern_5 {
    public static void main(String[] args) {
        print();
    }
    public static void print() {
        for (int i = 1; i <= 5; i++, System.out.println())
            // for every row, run the col
            for (int j = 1; j <= i; j++)
                System.out.print(" *");
            // when one row is printed we need to add a new line
        for (int i = 4; i >= 1; i--, System.out.println())
            // for every row, run the col
            for (int j = 1; j <= i; j++)
                System.out.print(" *");
            // when one row is printed we need to add a new line
    }
}
