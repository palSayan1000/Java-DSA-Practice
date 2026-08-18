package dsa.searching.linear;

public class FindMin {
    static void main() {
        int[] arr = {18, 12, 3, -7, 14, 28};
        System.out.println("The min val: " + min(arr));
    }
    static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i : arr)
            min = Math.min(min, i);
        return min;
    }
}
