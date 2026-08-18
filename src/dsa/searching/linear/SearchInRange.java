package dsa.searching.linear;

public class SearchInRange {
    // search in the array -> return the index if item found else -1.
    static int linearSearch(int[] arr, int target, int start, int end) {
        if(end - start == 0)
            return -1;
        // run for loop
        for(int index = start; index < end; index++)
            if(arr[index] == target)
                return index;
        // if not return executed so it means target not found
        return -1; // element not found
    }
    static void main() {
        var sc = new java.util.Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; arr[i++] = sc.nextInt());
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        System.out.println("Enter the start and the end index for searching: ");
        int eleIndex;
        System.out.printf((eleIndex = linearSearch(arr, target, sc.nextInt(), sc.nextInt())) == -1 ? "Element not Found\n" : "Element Found at: %d\n", eleIndex);
        sc.close();
    }
}
