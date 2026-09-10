package dsa.linked_list.patterns.floyd_cycle_finding;

public class Length_Of_Cycle {
    // find length of the cycle
    private int lengthOfCycle(ListNode head) {
        ListNode fast = cycleNodes(head), slow = fast;
        if (slow == null) throw new IllegalStateException("No cycle found");
        int lengthCount = 0;
        do {
            lengthCount++;
            slow = slow.next;
        } while (fast != slow);
        return lengthCount;
    }

    private ListNode cycleNodes(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return slow;
        }
        return null;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
