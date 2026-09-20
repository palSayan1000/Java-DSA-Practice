package dsa.data_structures.linked_list.problems.practice.linkedlist;

public class Delete_Node_In_A_Linked_List {

    private void deleteNode(ListNode node) {
        ListNode prev = null, curr = node, next = curr.next;
        while (next != null) {
            curr.val = next.val;
            prev = curr;
            curr = next;
            next = next.next;
        }
        assert prev != null;
        prev.next = null;
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
