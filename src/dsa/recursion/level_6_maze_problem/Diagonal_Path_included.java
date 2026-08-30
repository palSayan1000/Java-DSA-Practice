package dsa.recursion.level_6_maze_problem;

import java.util.ArrayList;

public class Diagonal_Path_included {
    static ArrayList<String> returnPath(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            var list = new ArrayList<String>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1 && col > 1)
            list.addAll(returnPath(processed + 'D', row - 1, col - 1));
        if (row > 1)
            list.addAll(returnPath(processed + 'V', row - 1, col));
        if (col > 1)
            list.addAll(returnPath(processed + 'H', row, col - 1));
        return list;
    }
    static void main() {
        System.out.println(returnPath("", 3, 3));
    }
}
