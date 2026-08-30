package basic_understanding.patterns;

public class Pattern_1 {
    public static void main(String[] args) {
        print();
    }
    public static void print() {
        for (int i = 1; i <= 4; i++, System.out.println())
            // for every row, run the col
            for (int j = 1; j <= 4; j++)
                System.out.print(" *");
            // when one row is printed we need to add a new line
    }
}
