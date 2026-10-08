package dsa.data_structures.linked_list.problems.practice.doublylinkedlist;

public class Flatten_A_Multilevel_Doubly_Linked_List {
    private Node flatten(Node head) {
        Node dummy = head;
        while (dummy != null) {
            if (dummy.child != null) {
                Node node = getTail(dummy.child);
                node.next = dummy.next;
                if (dummy.next != null)
                    dummy.next.prev = node;
                dummy.next = dummy.child;
                dummy.child.prev = dummy;
                dummy.child = null;
            }
            dummy = dummy.next;
        }
        return head;
    }

    private Node getTail(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node dummy = head;
        while (dummy.next != null) {
            dummy = dummy.next;
        }
        return dummy;
    }

    private static class Node {
        private int val;
        private Node prev;
        private Node next;
        private Node child;
    }
}
