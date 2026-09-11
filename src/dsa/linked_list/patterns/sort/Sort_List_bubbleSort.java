package dsa.linked_list.patterns.sort;

public class Sort_List_bubbleSort {

    static void main(String[] args) {
        ListNode head = new ListNode(3, new ListNode(1, new ListNode(2, new ListNode(9, new ListNode(-15, new ListNode(100, new ListNode(0)))))));

        Sort_List_bubbleSort sorter = new Sort_List_bubbleSort();
        ListNode sorted = sorter.sortList(head);

        for (ListNode n = sorted; n != null; n = n.next) {
            System.out.print(n.val + " ");
        }
    }

    /// Kunal's solution -> this one swaps the whole nodes and my one only swaps the values of the nodes
//    private void bubbleSort(int row, int col) {
//        if (row == 0) {
//            return;
//        }
//
//        if (col < row) {
//            Node first = get(col);
//            Node second = get (col + 1);
//
//            if (first.value > second.value) {
//                // swap
//                if (first == head) {
//                    head = second;
//                    first.next = second.next;
//                    second.next = first;
//                } else if (second == tail) {
//                    Node prev = get(col - 1);
//                    prev.next = second;
//                    tail = first;
//                    first.next = null;
//                    second.next = tail;
//                } else {
//                    Node prev = get (col - 1);
//                    prev.next = second;
//                    first.next = second.next;
//                    second.next = first;
//                }
//            }
//
//            bubbleSort(row, col + 1);
//        } else {
//            bubbleSort(row - 1, 0);
//        }
//    }
    private ListNode sortList(ListNode head) { // moving the values of the node
        if (head == null || head.next == null)
            return head;

        ListNode outerDummy = head, innerDummy = head, prevDummy = null;

        while (outerDummy.next != null) {
            while (innerDummy.next != prevDummy) {
                if (innerDummy.val > innerDummy.next.val) {
                    int temp = innerDummy.val;
                    innerDummy.val = innerDummy.next.val;
                    innerDummy.next.val = temp;
                }
                innerDummy = innerDummy.next;
            }
            prevDummy = innerDummy;
            innerDummy = head;
            outerDummy = outerDummy.next;
        }

        return head;
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
