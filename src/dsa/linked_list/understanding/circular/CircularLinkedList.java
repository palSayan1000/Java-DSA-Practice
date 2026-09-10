package dsa.linked_list.understanding.circular;

public class CircularLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    CircularLinkedList() {
        this.head = this.tail = null;
        size = 0;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty!!!");
            return;
        }
        Node dummy = head;
        do {
            System.out.print(dummy.value + " --> ");
            dummy = dummy.next;
        } while (dummy != head);
        System.out.println("HEAD.");
    }

    public void delete(int val) {
//        if (head == null)
//            return;
//        if (val == head.value) {
//            head = head.next;
//            tail.next = head;
//            return;
//        }
//        Node dummy = head, prev = null;
        // boolean f = false;
//        while (dummy != tail) {
//            if (dummy.value == val) {
        // f = true;
//                break;
        //}
//            head = node.next;
//            prev = dummy;
//            dummy = dummy.next;
//        }
//        // assert prev != null;
        // if (!found && tail.value != val)
        //    return;
//        if (prev != null)
//            prev.next = prev.next.next;
//        if (tail.value == val && dummy == tail)
//            tail = prev;
        Node node = head;
        if (node == null)
            return;
        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
        // this above kunals implementation is wrong what if the element that is to be removed is the tail node it does not checks that
    }

    private static class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }

        private Node(Node next) {
            this.next = next;
        }

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
