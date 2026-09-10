package dsa.linked_list.patterns.floyd_cycle_finding;

// https://leetcode.com/problems/middle-of-the-linked-list/description/
public class Middle_Of_The_Linked_List {

    private ListNode middleNode(ListNode head) {
        if (head == null)
            return null;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
