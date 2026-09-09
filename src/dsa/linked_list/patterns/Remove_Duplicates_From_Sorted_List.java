package dsa.linked_list.patterns;

public class Remove_Duplicates_From_Sorted_List {
    static void main() {

    }
    private ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = head.next, prev = head;
        while (dummy != null) {
            if (dummy.val == prev.val) {
                prev.next = dummy.next;
                dummy = prev.next;
            } else {
                prev = dummy;
                dummy = dummy.next;
            }
        }
        return head;
    }
    // Kunal's solution
//    private ListNode deleteDuplicatesKunal(ListNode head) {
//        ListNode node = head;
//
//        while (node.next != null) {
//            if (node.val == node.next.val)
//                node.next = node.next.next;
//            else node = node.next;
//        }
//          tail = node;
//          tail.next = null;
//    }
    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
