package dsa.data_structures.linked_list.problems.practice.linkedlist;

public class Insertion_Sort_List {
    private ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head.next;

        while (node != null) {
            ListNode dummy = head;
            int val = node.val;

            while (val > dummy.val) {
                dummy = dummy.next;
            }
            while (dummy != node) {
                int temp = dummy.val;
                dummy.val = val;
                val = temp;
                dummy = dummy.next;
            }

            dummy.val = val;
            node = node.next;
        }

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
