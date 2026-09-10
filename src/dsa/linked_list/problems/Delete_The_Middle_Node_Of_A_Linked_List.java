package dsa.linked_list.problems;

public class Delete_The_Middle_Node_Of_A_Linked_List {

    private ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode fast = head, slow = new ListNode(0, head);

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

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
