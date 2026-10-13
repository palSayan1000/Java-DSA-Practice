package dsa.data_structures.arrays.matrix;

// https://leetcode.com/problems/find-the-degree-of-each-vertex/description/
public class Find_The_Degree_Of_Each_Vertex {
    static void main() {
        System.out.println(java.util.Arrays.toString(
                new Find_The_Degree_Of_Each_Vertex().findDegrees(
                        new int[][]{
                                {0, 1, 1},
                                {1, 0, 1},
                                {1, 1, 0}
                        }
                )
        ));
    }

    public int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix.length];
        int i = 0;

        for (int[] arr : matrix) {
            int sum = 0;
            for (int j : arr) {
                sum += j;
            }
            ans[i++] = sum;
        }

        return ans;
    }
}
