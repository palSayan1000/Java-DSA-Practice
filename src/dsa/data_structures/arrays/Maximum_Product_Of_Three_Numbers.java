package dsa.data_structures.arrays;

// https://leetcode.com/problems/maximum-product-of-three-numbers/description/
public class Maximum_Product_Of_Three_Numbers {
    static void main() {
        System.out.println(new Maximum_Product_Of_Three_Numbers().maximumProduct(
                new int[] {-100,-98,-1,2,3,4}
        ));
    }

    public int maximumProduct(int[] nums) {
        int largestNum = Integer.MIN_VALUE,
            secondLargestNum = largestNum,
            thirdLargestNum = largestNum,
            smallestNum = Integer.MAX_VALUE,
            secondSmallestNum = smallestNum;

        for (int i : nums) {

            if (largestNum <= i) {
                thirdLargestNum = secondLargestNum;
                secondLargestNum = largestNum;
                largestNum = i;
            } else if (secondLargestNum <= i) {
                thirdLargestNum = secondLargestNum;
                secondLargestNum = i;
            } else if (thirdLargestNum <= i) {
                thirdLargestNum = i;
            }

            if (smallestNum >= i) {
                secondSmallestNum = smallestNum;
                smallestNum = i;
            } else if (secondSmallestNum >= i) {
                secondSmallestNum = i;
            }

        }

        return Math.max(thirdLargestNum * secondLargestNum * largestNum,
                        largestNum * secondSmallestNum * smallestNum);
    }
}
