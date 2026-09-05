package dsa.linked_list.making_my_own;

import java.util.Objects;

public class LinkedList<E> implements List<E> {

    private Node<E> head, tail;
    private int size;

    @Constructor // default constructor
    public LinkedList () {
        this.head = this.tail = null;
        this.size = 0;
    }

    @Constructor
    public LinkedList (E value) {
        addFirst(value);
    }

    @Constructor
    public LinkedList (E[] arr) {
        if (arr == null)
            return;
        for (E i: arr)
            addLast(i);
    }

    // returns the nth node of the linked list
    private Node<E> nthNode (int index) throws LinkedListException{
        if (index < 0 || index >= size)
            throw new ListOutOfBounds("Index Out Of Bounds!!!!");
        if (head == null)
            throw new ListEmpty("The List Is Empty!!!");
        Node<E> dummy = head;
        for (int i = 0; i < index; i ++)
            dummy = dummy.next;

        return dummy;
    }

    @Get // returns the size of the linked list
    public int getSize () {
        return size;
    }

    @Get // returns the value of the node at the specified index
    public E getEle (int index) throws ListOutOfBounds {
        return nthNode(index).value;
    }

    @Get // returns the value of the first node
    public E getFirst () throws ListEmpty {
        if (head == null)
            throw new ListEmpty("List Is Empty Bro!!!");

        return head.value;
    }

    @Get // returns the value of the last node
    public E getLast () throws ListEmpty {
        if (head == null)
            throw new ListEmpty("List Is Empty Bro!!!");

        return tail.value;
    }

    @Adding // adds a node to the linked in the first
    public void addFirst (E value) {
        Node<E> node = new Node<>(value);
        node.next = head;
        head = node;
        // Node<E> node = new Node<>(value, head); -> can do the above thing directly
        if (tail == null)
            tail = head;

        size ++;
    }

    @Adding // adds a node to the linked list at the last
    public void addLast (E value) {
        if (tail == null) {
            addFirst(value);
            return;
        }
        Node<E> node = new Node<>(value);

        tail.next = node;
        tail = node;

        size ++;
    }

    @Adding // adds a node at the specified index
    public void add (int index, E value) throws LinkedListException{
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }
        Node<E> prev = nthNode(index - 1);
        Node<E> node = new Node<>(value, prev.next);
        prev.next = node;
        if (prev == tail)
            tail = node;
        size ++;
    }

    @Deleting // deletes the last node
    public E removeLast () throws ListEmpty{
        if (head == null)
            throw new ListEmpty("The LinkedList Is Empty!!!");
        if (head.next == null)
            return removeFirst();

        tail = nthNode (size - 2);
        Node<E> temp = tail.next;
        tail.next = null;
        size --;

        return temp.value;
    }

    @Deleting // deletes the first node
    public E removeFirst () throws ListEmpty{
        if (head == null)
            throw new ListEmpty("The LinkedList Is Empty!!!");

        Node<E> temp = head;
        head = head.next;
        size --;
        if (head == null)
            tail = null;

        return temp.value;
    }

    @Deleting // deletes the node at the specified index
    public E remove (int index) throws LinkedListException{
        if (index == 0)
            return removeFirst();
        if (index == size - 1)
            return removeLast();
        Node<E> dummy = nthNode(index - 1), temp = dummy.next;
        dummy.next = dummy.next.next;
        size --;

        return temp.value;
    }

    // sets the node value at the specified index with the provided value
    public E set (int index, E value) throws LinkedListException {
        Node<E> dummy = nthNode(index);
        E temp = dummy.value;
        dummy.value = value;
        return temp;
    }

    @Finding // checks if a value contains in the linked list
    public boolean contains (E value) {
        if (head == null)
            return false;

        Node<E> dummy = head;
        while (dummy != null) {
            if (Objects.equals(dummy.value, value))
                return true;
            dummy = dummy.next;
        }
        return false;
    }

    @Finding // indexOf on the linked list
    public int indexOf (E value) {
        if (head == null)
            return -1;
        return indexOf (0, value);
    }

    @Finding // last-indexOf at the linked list
    public int lastIndexOf (E value) {
        if (head == null)
            return -1;
        return lastIndexOf (size - 1, value);
    }

    @Finding // indexOf from the given index
    public int indexOf (int index, E value) throws ListOutOfBounds {
        Node<E> dummy = index == 0? head : nthNode(index);
        int ans = -1;
        for (int i = index; dummy != null && ans == -1; i ++) {
            if (Objects.equals(dummy.value, value))
                ans = i;
            dummy = dummy.next;
        }
        return ans;
    }

    @Finding // lastIndexOf before the given index
    public int lastIndexOf (int index, E value) throws ListOutOfBounds {
        if (index < 0 || index >= size)
            throw new ListOutOfBounds("The Index Is Out Of Valid Range!!!!");
        Node<E> dummy = head;
        int ans = -1;
        for (int i = 0; i <= index; i ++) {
            if (Objects.equals(dummy.value, value))
                ans = i;
            dummy = dummy.next;
        }
        return ans;
    }

    @Display
    public void display () {

    }

    @Display
    public void display (E node) {

    }

    @Override
    public String toString() {


        return null;
    }

    private static class Node<E> {

        private E value;
        private Node<E> next;

        @Constructor
        public Node () {
            this.value = null;
            this.next = null;
        }

        @Constructor
        public Node (E value) {
            this.value = value;
            this.next = null;
        }

        @Constructor
        public Node (E value, Node<E> node) {
            this.value = value;
            this.next = node;
        }

        @Constructor
        public Node (Node<E> node) {
            this.value = node.value;
            this.next = node.next;
        }
    }
}
