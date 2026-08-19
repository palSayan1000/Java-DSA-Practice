package dsa.strings;

// https://leetcode.com/problems/reverse-string-prefix/

import java.util.Scanner;

public class Reverse_String_Prefix {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("The new Str: " + reversePrefix(str, k));
    }
////// Using StringBuilder ->
//    static public String reversePrefix(String s, int k) {
//        StringBuilder sb = new StringBuilder(s);
//        for (int i = 0; i < k - i - 1; i++){
//            char ch = sb.charAt(k - i - 1);
//            sb.setCharAt(k - i - 1, sb.charAt(i));
//            sb.setCharAt(i, ch);
//        }
//        return sb.toString();
//    }
////// Using toCharArray ->
    static String reversePrefix(String str, int k) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < k / 2; i++){
            char temp = ch[i];
            ch[i] = ch[k - 1 - i];
            ch[k - 1 - i] = temp;
        }
        return new String(ch);
    }
}
