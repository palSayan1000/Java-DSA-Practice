package dsa.linked_list.understanding.single;

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
        for (int i = 1; i < index; i++)
            dummy = dummy.next;
        dummy.next = new Node(val, dummy.next);
        size ++;
    }

    /// @returns the delete first element
    public int deleteFirst () {
        int value = head.value;
        head = head.next;
        if (head == null)
            tail = null;
        size --;
        return value;
    }

//    public int deleteLast () {
//        if (head.next == null) {
//            return deleteFirst();
//        }
//        Node dummy = new Node(head);
//        for (int i = 0; i < size - 1; i ++)
//            dummy = dummy.next;
//        int val = tail.value;
//        dummy.next = null;
//        tail = dummy;
//        size--;
//        return val;
//    }

    public void display () {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node get (int index) {
        Node node = head;
        for (int i = 0; i < index; i ++)
            node = node.next;
        return node;
    }

    @SuppressWarnings("UnusedReturnValue")
    public int deleteLast () {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete (int index) {
        if (index == 0){
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get (index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node find (int val) {
        Node node = head;
        while (node != null) {
            if (node.value == val)
                return node;
            node = node.next;
        }
        return null;
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
