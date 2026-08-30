package dsa.recursion.level_6_maze_problem;

import java.util.ArrayList;

public class Unique_Paths_Printing {
    static void main() {
        System.out.println(uniquePaths(3, 3));
    }
    static ArrayList<String> uniquePaths(int m, int n) {
        ArrayList<String> list =  new ArrayList<>();
        uniquePaths(0, 0, m, n, new StringBuilder(), list);
        return list;
    }
    /// My one
    static void uniquePaths(int i, int j, int m, int n,StringBuilder sb, ArrayList<String> paths) {
        if (i == m - 1 && j == n - 1) {
            paths.add(sb.toString());
            return;
        }
        if (i >= m || j >= n) return;
        sb.append("R");
        uniquePaths(i + 1, j, m, n, sb, paths);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("D");
        uniquePaths(i, j + 1, m, n, sb, paths);
        sb.deleteCharAt(sb.length() - 1);
    }
    /// Kunal's ome
    static void printPaths(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }
        if (row > 1)
            printPaths(processed + 'D', row - 1, col);
        if (col > 1)
            printPaths(processed + 'R', row, col - 1);
    }
    /// returning arraylist
    static ArrayList<String> printPathsRtn(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            var list = new ArrayList<String>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1)
            list.addAll(printPathsRtn(processed + 'D', row - 1, col));
        if (col > 1)
            list.addAll(printPathsRtn(processed + 'R', row, col - 1));
        return list;
    }
}
