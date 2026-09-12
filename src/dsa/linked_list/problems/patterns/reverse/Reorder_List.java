package dsa.linked_list.problems.patterns.reverse;

// https://leetcode.com/problems/reorder-list/description/
public class Reorder_List {

    private void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode mid = middleNode(head), headFirst = head, headSecond = reverseList(mid);

        // Re-arrange
        while (headFirst != null && headSecond != null) {
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        // next of tail to null
        if (headFirst != null) {
            headFirst.next = null;
        }
    }

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

    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode present = head, previous = null;

        while (present != null) {
            ListNode future = present.next;
            present.next = previous;
            previous = present;
            present = future;
        }

        return previous;
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
