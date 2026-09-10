package dsa.linked_list.patterns.sort;

// https://leetcode.com/problems/merge-two-sorted-lists/description/
public class Merge_Two_Sorted_List {
    static void main() {

    }
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
*/
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = list1, second = list2, prev = new ListNode(), head = prev;
        while (first != null && second != null) {
            if (first.val <= second.val) {
                prev.next = first;
                prev = first;
                first = first.next;
            } else {
                prev.next = second;
                prev = second;
                second = second.next;
            }
        }
        while (first != null) {
            prev.next = first;
            prev = first;
            first = first.next;
        }
        while (second != null) {
            prev.next = second;
            prev = second;
            second = second.next;
        }
        return head.next;
    }
    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
