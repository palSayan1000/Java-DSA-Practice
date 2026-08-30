package dsa.recursion.level_3_subset_subsequence_string;

public class Skip_Apple {
    static void main() {
        String str = "bacappledgf";
        System.out.println(skipApple(str));
    }
    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring("apple".length()));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    // should skipp app not apple
    static String skipAppApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppApple(up.substring("apple".length()));
        } else {
            return up.charAt(0) + skipAppApple(up.substring(1));
        }
    }
}
