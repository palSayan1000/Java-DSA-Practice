package dsa.math.problems;

public class Sign_Of_The_Product_Of_An_Array {
    static void main() {
        System.out.println(new Sign_Of_The_Product_Of_An_Array().arraySign(new int[] {-1,-2,-3,-4,3,2,1}));
    }
    int arraySign(int[] nums) {
        int prod = 1;
        for (int i = 0; i < nums.length && prod != 0; i++)
            prod *= nums[i] == 0 ? 0 : nums[i] < 1 ? -1 : 1;
        return prod;
    }
}
