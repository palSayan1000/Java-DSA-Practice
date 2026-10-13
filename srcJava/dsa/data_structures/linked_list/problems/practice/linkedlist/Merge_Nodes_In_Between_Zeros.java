package dsa.data_structures.linked_list.problems.practice.linkedlist;

// https://leetcode.com/problems/merge-nodes-in-between-zeros/description/
public class Merge_Nodes_In_Between_Zeros {
    private ListNode mergeNodes(ListNode head) {
        int currSum = 0;
        ListNode dummy = head.next, node = new ListNode(), newHead = node;

        while (dummy != null) {
            currSum += dummy.val;
            if (dummy.val == 0) {
                node.next = new ListNode(currSum);
                node = node.next;
                currSum = 0;
            }
            dummy = dummy.next;
        }

        return newHead.next;
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
