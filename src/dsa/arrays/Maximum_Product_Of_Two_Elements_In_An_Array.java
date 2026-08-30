package dsa.arrays;

public class Maximum_Product_Of_Two_Elements_In_An_Array {
    static void main() {
        System.out.println("Maximum Product of Two Elements In An Array : " + maxProduct(new int[] {3,4,5,2}));
    }
    static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, secondMax = max + 1;
        for (int num: nums)
            if (max <= num) {
                secondMax = max;
                max = num;
            } else if (secondMax < num)
                secondMax = num;
        return -- secondMax * -- max;
    }
}
