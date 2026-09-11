package dsa.linked_list.problems;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class Remove_Nth_Node_From_End_Of_List {

    static void main() {
        ListNode head = new ListNode(1);
        // System.out.println(new Remove_Nth_Node_From_End_Of_List().removeNthFromEnd(head, 1).val);
    }

    private ListNode nthNode(ListNode head, int index) {
        ListNode dummy = head;

        for (int i = 0; i < index; i++)
            dummy = dummy.next;

        return dummy;
    }

    private int size(ListNode head) {
        if (head == null)
            return 0;

        ListNode dummy = head;
        int size = 0;

        while (dummy != null) {
            dummy = dummy.next;
            size++;
        }

        return size;
    }

    private ListNode removeNthFromEnd(ListNode head, int index) {
        index = size(head) - index;

        if (index == 0) {
            return head == null ? null : head.next;
        }

        ListNode dummy = nthNode(head, index - 1);
        dummy.next = dummy.next.next;

        return head;
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
