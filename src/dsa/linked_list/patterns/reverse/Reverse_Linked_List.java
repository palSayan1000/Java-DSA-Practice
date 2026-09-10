package dsa.linked_list.patterns.reverse;

// https://leetcode.com/problems/reverse-linked-list/description/
public class Reverse_Linked_List {

    static ListNode head;
    // google, amazon, apple
    // In-Place reversal of linked list
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

    // Reversing Linked List using recursion
    private  ListNode reverseListRecursion(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            Reverse_Linked_List.head = head;
            return head;
        }
        ListNode node = reverseListRecursion(head.next);
        node.next = head;
        head.next = null;
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

    static void main(String[] args) {
        ListNode head = new ListNode(3, new ListNode(1, new ListNode(2, new ListNode(9, new ListNode(-15, new ListNode(100, new ListNode(0)))))));

        new Reverse_Linked_List().reverseListRecursion(head);

        for (ListNode n = Reverse_Linked_List.head; n != null; n = n.next) {
            System.out.print(n.val + " ");
        }
    }
}
