package dsa.linked_list.patterns.floyd_cycle_finding;

// https://leetcode.com/problems/linked-list-cycle-ii/description/
public class Linked_List_Cycle_II {

    private ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) { // then will meet at the start of the node
                    slow = slow.next;
                    fast = fast.next;
                }
                return fast;
            }
        }

        return null;
    }

    // Kunal's method
    private ListNode detectCycle_(ListNode head) {
        int length = 0;

        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthOfCycle(head);
                break;
            }
        }

        if (length == 0) {
            return null;
        }
        // find the start node;
        ListNode first = head, second = head;

        while (length > 0) {
            second = second.next;
            length --;
        }

        // keep moving both forward and they will meet at the start of the cycle
        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return first;
    }
        // find length of the cycle
    private int lengthOfCycle (ListNode head) {
        ListNode fast = head, slow = fast;
        if (slow == null) throw new IllegalStateException("No cycle found");
        int lengthCount = 0;
        do {
            lengthCount ++;
            slow = slow.next;
        } while (fast != slow);
        return lengthCount;
    }

    private static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
