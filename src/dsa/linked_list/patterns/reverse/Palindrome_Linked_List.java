package dsa.linked_list.patterns.reverse;

// https://leetcode.com/problems/palindrome-linked-list/description/
public class Palindrome_Linked_List {

    private boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode firstDummy = head, secondDummy = reverseList(middleNode(head));

        while (firstDummy != null && secondDummy != null) {
            if (firstDummy.val != secondDummy.val)
                return false;
            firstDummy = firstDummy.next;
            secondDummy = secondDummy.next;
        }

        return true;
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
