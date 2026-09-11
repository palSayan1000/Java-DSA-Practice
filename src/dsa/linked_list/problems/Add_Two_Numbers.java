package dsa.linked_list.problems;

// https://leetcode.com/problems/add-two-numbers/description/
public class Add_Two_Numbers {

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy1 = l1, dummy2 = l2, head = new ListNode(0), headDummy = head;
        int carry = 0;
        while (dummy1 != null && dummy2 != null) {
            int sum = dummy1.val + dummy2.val + carry;
            headDummy.next = new ListNode(sum % 10);
            carry = sum / 10;
            dummy1 = dummy1.next;
            dummy2 = dummy2.next;
            headDummy = headDummy.next;
        }
        while (dummy1 != null) {
            int sum = dummy1.val + carry;
            headDummy.next = new ListNode(sum % 10);
            carry = sum / 10;
            dummy1 = dummy1.next;
            headDummy = headDummy.next;
        }
        while (dummy2 != null) {
            int sum = dummy2.val + carry;
            headDummy.next = new ListNode(sum % 10);
            carry = sum / 10;
            dummy2 = dummy2.next;
            headDummy = headDummy.next;
        }

        if (carry != 0) {
            headDummy.next = new ListNode(carry);
        }

        return head.next;
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
