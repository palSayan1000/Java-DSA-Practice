package dsa.recursion.level_3_patterns_and_basic_sort;

public class Triangle_1 {
    static void main() {
        // pattern1(5, 1);
        pattern(4, 0);
    }
    static void pattern_(int row, int col){
        if (col > row) return;
        if (row == 0) return;
        System.out.print("*\t");
        pattern_(row, col + 1);
        if (col == 1) {
            System.out.println();
            pattern_(row - 1, 1);
        }
    }
    static void pattern(int row, int col) {
        if (row == 0) return;
        if (col == row) {
            System.out.println();
            pattern(row - 1, 0);
            return;
        }
        System.out.print("*\t");
        pattern(row, col + 1);
    }
}
