package dsa.data_structures.strings;

// https://leetcode.com/problems/jewels-and-stones/description/
public class Jewels_And_Stones {
    static void main() {
        System.out.println(new Jewels_And_Stones()
                .numJewelsInStones("z", "ZZ"));
    }

    public int numJewelsInStones(String jewels, String stones) {
        int[] freq = new int[256];

        for (char ch : stones.toCharArray()) {
            freq[ch]++;
        }

        int count = 0;
        for (char ch : jewels.toCharArray()) {
            if (freq[ch] != 0) {
                count += freq[ch];
            }
        }

        return count;
    }
}
