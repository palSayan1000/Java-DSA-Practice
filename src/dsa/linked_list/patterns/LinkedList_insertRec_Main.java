package dsa.linked_list.patterns;

class LinkedList_insertRec {
    Node head, tail;

    public LinkedList_insertRec() {
        this.head = null;
        this.tail = null;
    }

    // insert using recursion
    public void insertRec (int val, int index) {
//        Node dummy = new Node (head);
//        insertRec(val, index + 1, dummy);

        // or

        head = insertRec(head, val, index); // in the end head will be returned if the new head is added it gets updated here

        // or

//        head = insertRevKunal(val, index, head);
    }

    // kunal kushwaha solution
    private Node insertRevKunal (int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node (val, node);
            // size ++;
            return temp;
        }

        node.next = insertRevKunal(val, index - 1, node.next);
        return node;
    }

    private void insertRec (int val, int index, Node dummy) { // here the Node next excepts a dummy new Node whole next points to head
        if (index == 1) {
            Node node = new Node(val);
            node.next = dummy.next;
            if (dummy.next != head)
                dummy.next = node;
            else head = node;
            return;
        }
        insertRec(val, index - 1, dummy.next);
    }

    private Node insertRec (Node node, int val, int index) {
        if (index == 0) {
            Node newNode = new Node (val);
            newNode.next = node;
            return newNode;
        }
        node.next = insertRec(node.next, val, index - 1);
        return node;
    }

    public void display () {
        displayRec(head);
    }

    public void displayRec () {
        displayRevRec(head);
    }

    private void displayRec (Node node) {
        if (node == null) {
            System.out.println("END.");
            return;
        }
        System.out.print(node.value + " --> ");
        displayRec(node.next);
    }

    private void displayRevRec (Node node) {
        if (node == null) {
            System.out.println("START.");
            return;
        }
        System.out.print(node.value + " -- > ");
        displayRevRec(node.next);
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        node.next  = head;
        head = node;

        if (tail == null)
            tail = head;
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

public class LinkedList_insertRec_Main {
    static void main() {
        LinkedList_insertRec list = new LinkedList_insertRec();
        list.addFirst(1);
        list.addFirst(9);
        list.addFirst(5);
        list.addFirst(3);

        list.display();

        list.insertRec(7, 3);

        list.display();
    }
}