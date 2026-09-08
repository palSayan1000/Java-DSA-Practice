package dsa.linked_list.understanding.doubly;

import dsa.linked_list.understanding.single.LinkedList;

public class DoublyLinkedList {

    private Node head,tail;
    private int size;

    public DoublyLinkedList () {
        size = 0;
        head = tail = null;
    }

    public DoublyLinkedList(int size) {
        this.size = size;
        head = tail = null;
    }

    public void insertFirst(int val) {
        Node node = new Node (val);
        node.next = head;
        if (head != null)
            head.prev = node;
        node.prev = null;
        head = node;
        if (tail == null)
            tail = head;
        size ++;
    }

    public void display () {
        Node dummy  = head;
        while (dummy != null) {
            System.out.print(dummy.value + " --> ");
            dummy = dummy.next;
        }
        System.out.println("null.");
    }

    public void displayRev () {
        Node dummy  = head, last = null;
        System.out.println("Print in Strait :-");
        while (dummy != null) {
            System.out.print(dummy.value + " --> ");
            last = dummy;
            dummy = dummy.next;
        }
        System.out.println("END.");
        System.out.println("Print in Reverse :-");
        while (last != null) {
            System.out.print(last.value + " --> ");
            last = last.prev;
        }
        System.out.println("START.");
    }

    public void insertLast (int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node dummy = head;
        while (dummy.next != null) {
            dummy = dummy.next;
        }
        Node node = new Node(val);
        dummy.next = node;
        node.next = null;
        node.prev = dummy;
        size ++;
    }

    public void insert (int index, int val) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
           insertLast(val);
           return;
        }
        Node dummy = head, newNode;
        for (int i = 1; i < index; i++)
            dummy = dummy.next;
        dummy.next = new Node(val, dummy.next, dummy);
        size ++;
    }

    public Node find (int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value)
                return node;
            node = node.next;
        }
        return null;
    }

    // Inserting an node after a specific node with the given value
    public void insertAfter (int value, int newNodeVal) {
        Node dummy = find (value);
        if (dummy == null)
            return;
        Node node = new Node (newNodeVal);
        node.next = dummy.next;
        if (dummy.next != null)
            dummy.next.prev = node;
        dummy.next = node;
        node.prev = dummy;
        size ++;
    }

    private static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, Node prev) {
            this.next = next;
            this.prev = prev;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}