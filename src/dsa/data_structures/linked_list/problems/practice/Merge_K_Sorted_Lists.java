package dsa.data_structures.linked_list.problems.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge_K_Sorted_Lists {
    static void main() {
        // i am lazy cannot write the main method
    }

    private ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();

        for (ListNode node: lists)
            while (node != null) {
                list.add(node.val);
                node = node.next;
            }

        Collections.sort(list);

        ListNode dummy = new ListNode(0), headPrev = dummy;

        for (int i: list) {
            dummy.next = new ListNode(i);
            dummy = dummy.next;
        }

        return headPrev.next;
    }
    // public ListNode mergeKLists(ListNode[] lists) {
    //     if (lists == null || lists.length == 0) {
    //         return null;
    //     }
    //     ListNode head = lists[0];

    //     for (int i = 1; i < lists.length; i ++) {
    //         head = mergeTwoLists(head, lists[i]);
    //     }

    //     return head;
    // }
    // private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //     ListNode first = list1, second = list2, prev = new ListNode(), head = prev;
    //     while (first != null && second != null) {
    //         if (first.val <= second.val) {
    //             prev.next = first;
    //             prev = first;
    //             first = first.next;
    //         } else {
    //             prev.next = second;
    //             prev = second;
    //             second = second.next;
    //         }
    //     }
    //     while (first != null) {
    //         prev.next = first;
    //         prev = first;
    //         first = first.next;
    //     }
    //     while (second != null) {
    //         prev.next = second;
    //         prev = second;
    //         second = second.next;
    //     }
    //     return head.next;
    // }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
