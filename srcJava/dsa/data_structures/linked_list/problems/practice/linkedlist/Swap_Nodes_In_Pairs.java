package dsa.data_structures.linked_list.problems.practice.linkedlist;

public class Swap_Nodes_In_Pairs {
    static void main() {
        // I cannot write the main method for testing I am lazy
    }

    private ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head, next = head.next, prev = null, newHead = next;

        while (curr != null && next != null) {
            ListNode temp = next.next;
            if (prev != null) {
                prev.next = next;
            }
            next.next = curr;
            curr.next = temp;
            prev = curr;
            if (curr != null) {
                curr = curr.next;
            }
            if (curr != null) {
                next = curr.next;
            }
        }

        return newHead;
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
