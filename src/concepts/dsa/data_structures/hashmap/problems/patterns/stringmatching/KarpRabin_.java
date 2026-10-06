package concepts.dsa.data_structures.hashmap.problems.patterns.stringmatching;

public class KarpRabin_ {
    private static final int BASE = 256;
    private static final long MOD = 1_000_000_007L;

    // Hash of the first `length` characters of str
    private long calculateHash(String str, int length) {
        long hash = 0;

        for (int i = 0; i < length; i++) {
            hash = (hash * BASE + str.charAt(i)) % MOD;
        }

        return hash;
    }

    // Slide the window: remove oldChar, shift, add newChar
    // highPower = BASE^(patternLength - 1) % MOD
    private long updateHash(long prevHash, char oldChar, char newChar, long highPower) {
        long newHash = (prevHash - oldChar * highPower % MOD + MOD) % MOD;
        newHash = (newHash * BASE + newChar) % MOD;
        return newHash;
    }

    public void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        if (m == 0 || m > n) return;

        long highPower = 1;
        for (int i = 0; i < m - 1; i++) {
            highPower = (highPower * BASE) % MOD;
        }

        long patternHash = calculateHash(pattern, m);
        long textHash = calculateHash(text, m);

        for (int i = 0; i <= n - m; i++) {
            if (textHash == patternHash && text.regionMatches(i, pattern, 0, m)) {
                System.out.println("Pattern Found At Index : " + i);
            }

            if (i < n - m) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + m), highPower);
            }
        }
    }
}