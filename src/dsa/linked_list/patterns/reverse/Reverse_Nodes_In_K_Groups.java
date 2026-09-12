package dsa.linked_list.patterns.reverse;

import java.util.Objects;

// https://leetcode.com/problems/reverse-nodes-in-k-group/description/
public class Reverse_Nodes_In_K_Groups {

    // My solution
    private ListNode reverseKGroup(ListNode head, int k) {
        int left = 1, right = k, size = getSize(head);

        while (right < size) {
            head = reverseBetween(head, left, right);
            left += k;
            right += k;
        }

        return head;
    }

    private ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right)
            return head;

        // skip the first left - 1 node -->
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = Objects.requireNonNull(current).next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }

    private int getSize(ListNode head) {
        if (head == null)
            return 0;
        int size = 0;
        ListNode dummy = head;
        while (dummy != null) {
            size++;
            dummy = dummy.next;
        }
        return size;
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
