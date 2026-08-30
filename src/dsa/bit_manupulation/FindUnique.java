package dsa.bit_manupulation;

public class FindUnique {
    static void main() {
        /*
        Every element appears twice and one element only once find that element
        and arr contains only elements >=1
         */
        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println("Unique Element: " + getUniqueEle(arr));
    }
    static int getUniqueEle(int[] arr) {
        if (arr.length == 0) return -1;
        int uniqueEle = 0;
        for (int j : arr) uniqueEle ^= j;
        return uniqueEle == 0? -1 : uniqueEle;
    }
}
