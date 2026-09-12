package dsa.linked_list.patterns;

// https://leetcode.com/problems/rotate-list/description/
public class Rotate_List {

    private ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null)
            return head;
        int size = getSize(head);
        k = k % size;

        ListNode newLast = nthNode(head, size - k - 1), nodeLast = nthNode(head, size - 1), newHead = newLast.next;

        nodeLast.next = head;
        newLast.next = null;

        return newHead == null ? head : newHead;
    }

    private ListNode nthNode(ListNode head, int index) {
        if (head == null)
            return null;

        ListNode dummy = head;
        for (int i = 0; i < index; i++)
            dummy = dummy.next;

        return dummy;
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
