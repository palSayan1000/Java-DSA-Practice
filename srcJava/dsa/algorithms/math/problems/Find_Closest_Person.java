package dsa.algorithms.math.problems;

// https://leetcode.com/problems/find-closest-person/description/
public class Find_Closest_Person {
    static void main() {
        System.out.println(new Find_Closest_Person()
                .findClosest(2, 7, 4));
    }

    public int findClosest(int x, int y, int z) {
        return Math.abs(z - x) < Math.abs(z - y) ? 1 :
                Math.abs(z - x) > Math.abs(z - y) ? 2 : 0;
    }
}
