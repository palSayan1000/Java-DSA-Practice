package dsa.data_structures.linked_list.problems.practice.linkedlist;

// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/
public class Convert_Binary_Number_In_A_Linked_List_To_Integer {
    private int getDecimalValue(ListNode head) {
        // int binary = 0b0;
        int binary = 0;
        ListNode dummy = head;

        do binary = (binary << 1) | dummy.val;
        while ((dummy = dummy.next) != null);

        return binary;
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
