package dsa.linked_list.problems.patterns.sort;

// https://leetcode.com/problems/sort-list/description/
public class Sort_List_mergeSort {

    private ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode middle = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(middle);

        return mergeTwoLists(left, right);
    }

    private ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = list1;
        ListNode second = list2;
        ListNode prev = new ListNode();
        ListNode head = prev;

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
