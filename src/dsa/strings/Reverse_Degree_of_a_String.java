package dsa.strings;

// https://leetcode.com/problems/reverse-degree-of-a-string/description/

public class Reverse_Degree_of_a_String {
    static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the string: ");
        System.out.println("The reverse degree of the string is: " + sc.next());
    }

    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); sum += (123 - s.charAt(i)) * ++i) ;
        return sum;
    }
}
// (123 - s.charAt(i)) = by doing this what is happing a is being mapped to 26 = 123 - 97 (a)
//                                                                          25 = 123 - 98 (b)
//                                                                               ..........
//                                                                           1 = 123 - 122 (z)
// remember this logic
