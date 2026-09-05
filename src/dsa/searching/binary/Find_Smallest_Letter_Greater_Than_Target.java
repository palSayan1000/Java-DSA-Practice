package dsa.searching.binary;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class Find_Smallest_Letter_Greater_Than_Target {
    static void main() {
        char[] arr = {'x', 'x', 'y', 'y'};
        char target = 'z';
        IO.println("The next greatest letter is: " + nextGreatestLetter(arr, target));
    }
    //// better one full efficiency
    static public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1, mid;
//        if (target >= letters[end] || target < letters[start])
//            return letters[0];
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < letters[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start % letters.length];
    }
    //// I did this alone but there is flaw the inner loop part should should also be done using binary search
//    static public char nextGreatestLetter(char[] letters, char target) {
//        int start = 0, end = letters.length - 1, mid;
//        if (target >= letters[end] || target < letters[start])
//            return letters[0];
//        while (start <= end) {
//            mid = start + (end - start) / 2;
//            if (target == letters[mid]) {
//                for (int i = mid + 1; i < letters.length; i++)
//                    if (letters[mid] != letters[i])
//                        return letters[i];
//                return letters[0];
//            }
//            if (target < letters[mid])
//                end = mid - 1;
//            else
//                start = mid + 1;
//        }
//        return letters[start];
//    }
}
