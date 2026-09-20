package dsa.data_structures.linked_list.problems.practice.linkedlist;

// https://leetcode.com/problems/odd-even-linked-list/description/?envType=problem-list-v2&envId=linked-list
public class Odd_Even_Linked_List {
    private ListNode oddEvenList(ListNode head) {
        ListNode oddHead = new ListNode(),
            evenHead = new ListNode(), dummyOddHead = oddHead,
            dummyEvenHead = evenHead, dummy = head;

        for (int i = 1; dummy != null; i++) {
            if (i % 2 == 0) {
                evenHead.next = dummy;
                evenHead = evenHead.next;
            } else {
                oddHead.next = dummy;
                oddHead = oddHead.next;
            }
            dummy = dummy.next;
        }

        evenHead.next = null;
        oddHead.next = dummyEvenHead.next;
        return dummyOddHead.next;
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
