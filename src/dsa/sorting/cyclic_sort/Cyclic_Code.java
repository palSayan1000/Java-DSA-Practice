package dsa.sorting.cyclic_sort;

public class Cyclic_Code {
    static void main() {
        int[] arr = {3, 5, 2, 1, 4}; //// array should only contain elements from 1 to n or 0 to n-1 or something like this
        cyclic(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
    // My code
    static void cyclic_(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
            if(arr[i] - 1 != i) /* checking arr[i] - 1 = arr[i] index is it == i */
                swap (arr, arr[i] - 1, i --); // swaping with the correct index
    }
    // Kunal's code // use this it is better
    static void cyclic(int[] arr){
        int i = 0;
        while (i < arr.length - 1) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct])
                swap (arr, i, correct);
            else i ++;
        }
    }
    static void swap(int[] arr, int i, int j){
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
}
