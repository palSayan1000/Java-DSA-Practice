package dsa.data_structures.linked_list.problems.practice.linkedlist;

public class Remove_Linked_List_Elements {

    private ListNode removeElements(ListNode head, int val) {
        ListNode dummy = head, prev = new ListNode(0, head), newHead = prev;
        while (dummy != null) {
            if (dummy.val == val) {
                prev.next = dummy.next;
            } else {
                prev = dummy;
            }
            dummy = dummy.next;
        }
        return newHead.next;
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
