package dsa.recursion.level_2_array;

import java.util.ArrayList;

public class LinearSearch {
    static void main() {
        int[] arr = {8, 1, 2, 0, 8, 12, 8, 8, 8, 9, 12};
        // System.out.println(search(arr, 8, 0));
        // findAllIndices(arr, 8, 0);
        // System.out.println(list);
        ArrayList<Integer> list = findAllIndices(arr, 8, 0);
        System.out.println(list);
    }
    static boolean search(int[] arr, int target, int index) {
        if (arr.length == index) return false;
        return arr[index] == target || search(arr, target, index + 1);
    }
    static int findIndex(int[] arr, int target, int index) {
        if (arr.length == index) return -1;
        if (arr[index] == target) return index;
        return findIndex(arr, target, index + 1);
    }
    static int findLastIndex(int[] arr, int target, int index) {
        if (index == -1) return -1;
        if (arr[index] == target) return index;
        return findLastIndex(arr, target, index - 1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
//    static void findAllIndices(int[] arr, int target, int index) {
//        if (arr.length == index) return;
//        if (arr[index] == target) list.add(index);
//        findAllIndices(arr, target, index + 1);
//    }
    // returning list
    static ArrayList<Integer> findAllIndices(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (arr.length == index) return list;
        if (arr[index] == target) list.add(index);
        return findAllIndices(arr, target, index + 1, list);
    }
    // returning list but not passing list
    static ArrayList<Integer> findAllIndices(int[] arr, int target, int index) {
        if (arr.length == index) return new ArrayList<>();
        ArrayList<Integer> list = findAllIndices(arr, target, index + 1);
        if (arr[index] == target)
            list.add(0, index);
        return list;
    }
}