package dsa.sorting.merge_sort.problems;

public class Median_Of_Two_Sorted_Arrays {
    static void main() {
        var obj = new Median_Of_Two_Sorted_Arrays();
        System.out.println(obj.findMedianSortedArrays(
                new int[]{1, 3}, new int[]{2}
        ));
        System.out.println(obj.findMedianSortedArrays(
                new int[]{1, 2}, new int[]{3, 4}
        ));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = merge(nums1, nums2);
        return mergedArray.length % 2 == 1 ? mergedArray[mergedArray.length / 2] :
                (mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length / 2]) / 2.0;
    }

    public int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            ans[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            ans[k++] = arr2[j++];
        }

        return ans;
    }
}
