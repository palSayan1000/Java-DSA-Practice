package dsa.data_structures.heaps.problems.practice;

import java.util.Arrays;
// import java.util.PriorityQueue;

// https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class Kth_Largest_Element_In_An_Array {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for (int num : nums) {
//             pq.add(num);
//             if (pq.size() > k) {
//                 pq.poll();
//             }
//         }
//         assert pq.peek() != null;
//         return pq.peek();
//    }
//    public int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
//
//        for (int i : nums) {
//            priorityQueue.offer(i);
//        }
//
//        for (int i = 0; i < k - 1; i++) {
//            priorityQueue.poll();
//        }
//
//        assert priorityQueue.peek() != null;
//        return priorityQueue.peek();
//    }
}
