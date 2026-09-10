package dsa.linked_list.patterns.floyd_cycle_finding;

// https://leetcode.com/problems/linked-list-cycle/description/
public class Linked_List_Cycle {
    static void main() {

    }
    private boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
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
