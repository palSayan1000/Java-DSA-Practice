package dsa.algorithms.recursion.problems;

import java.util.HashSet;

public class Letter_Tile_Possibilities {
    static void main() {
        System.out.println(new Letter_Tile_Possibilities().numTilePossibilities("AAB"));
    }
    HashSet<String> set = new HashSet<>();

    public int numTilePossibilities(String tiles) {
        countPossibilities(tiles, new boolean[tiles.length()], new StringBuilder());
        return set.size();
    }

    private void countPossibilities(String tiles, boolean[] visited, StringBuilder sb) {
        if (tiles.length() == sb.length()) {
            return;
        }
        for (int i = 0; i < tiles.length(); i++) {

            if (visited[i]) {
                continue;
            }

            visited[i] = true; // backtracking

            sb.append(tiles.charAt(i));
            set.add(sb.toString());

            countPossibilities(tiles, visited, sb);

            sb.deleteCharAt(sb.length() - 1);

            visited[i] = false; // backtracking
        }
    }
}
