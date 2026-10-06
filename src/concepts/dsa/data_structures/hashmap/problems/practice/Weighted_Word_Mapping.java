package concepts.dsa.data_structures.hashmap.problems.practice;

// https://leetcode.com/problems/weighted-word-mapping/description/
public class Weighted_Word_Mapping {
    static void main() {
        System.out.println(new Weighted_Word_Mapping()
                .mapWordWeights(
                        new String[]{"abcd", "def", "xyz"},
                        new int[]{5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2}
                ));
    }

    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            int weight = 0;
            for (char ch : word.toCharArray()) {
                weight += weights[ch - 97];
            }
            sb.append((char) (Math.abs(weight % 26 - 25) + 97));
        }

        return sb.toString();
    }
}
