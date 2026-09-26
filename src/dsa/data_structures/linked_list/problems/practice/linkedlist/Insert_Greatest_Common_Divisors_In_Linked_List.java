package dsa.data_structures.linked_list.problems.practice.linkedlist;

// https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/
public class Insert_Greatest_Common_Divisors_In_Linked_List {

    private ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode dummy = head.next, prev = head;
        while (dummy != null) {
            ListNode node = new ListNode(gcd(dummy.val, prev.val));
            prev.next = node;
            node.next = dummy;
            prev = dummy;
            dummy = dummy.next;
        }
        return head;
    }
    public int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
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
