package dsa.recursion.level_3_patterns_and_basic_sort;

public class Triangle_2 {
    static void main() {
        // pattern1(5, 1);
        pattern_(1, 1);
    }
    static void pattern_(int row, int col){
        if (col > row) return;
        if (row == 5) return;
        pattern_(row, col + 1);
        System.out.print("*\t");
        if (col == 1) {
            System.out.println();
            pattern_(row + 1, 1);
        }
    }
    static void pattern(int row, int col) {
        if (row == 0) return;
        if (col == row) {
            pattern(row - 1, 0);
            System.out.println();
            return;
        }
        pattern(row, col + 1);
        System.out.print("*\t");
    }
}
