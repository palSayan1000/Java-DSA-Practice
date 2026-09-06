package dsa.linked_list.understanding;

public class LinkedList {

    private Node head, tail;
    private int size;

    public LinkedList () {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next  = head;
        head = node;

        if (tail == null)
            tail = head;

        size ++;
    }

    public void insertLast (int val) {
        if (tail == null) {
            insertFirst (val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
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
        for (int i = 0; i < index; i++)
            dummy = dummy.next;
        dummy.next = new Node(val, dummy.next);
    }

    public void display () {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
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
