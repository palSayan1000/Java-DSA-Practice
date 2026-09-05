package dsa.linked_list.understanding;

import java.util.Objects;

public class LinkedList<E> implements List<E> {

    private Node<E> head, tail;
    private int size;

    @Constructor
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
        for (E i: arr)
            addLast(i);
        size = arr.length;
    }

    public int getSize () {
        return size;
    }

    public E getEle (int index) throws ListOutOfBounds{
        if (index < 0 || index >= size)
            throw new ListOutOfBounds("The Index Is Out Of Valid Range!!!!");
        Node<E> dummy = head;
        for (int i = 0; i < index; i ++)
            dummy = dummy.next;
        return dummy.next.value;
    }

    @Adding
    public void addFirst (E value) {
        Node<E> node = new Node<>(value);
        node.next = head;
        head = node;
        // Node<E> node = new Node<>(value, head); -> can do the above thing directly
        if (tail == null)
            tail = head;

        size ++;
    }

    @Adding
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

    @Deleting
    public E removeLast () throws ListEmpty{
        if (head == null)
            throw new ListEmpty("The LinkedList Is Empty!!!");
        if (head.next == null)
            return removeFirst();

        E temp = tail.value;
        Node<E> dummy = head;
        while (dummy.next.next != null)
            dummy = dummy.next;
        tail = dummy;
        tail.next = null;
        size --;

        return temp;
    }

    @Deleting
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

    @Finding
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

    @Finding
    public int indexOf (E value) {
        if (head == null)
            return -1;
        return indexOf (0, value);
    }

    @Finding
    public int lastIndexOf (E value) {
        if (head == null)
            return -1;
        return lastIndexOf (size - 1, value);
    }

    @Finding
    public int indexOf (int index, E value) throws ListOutOfBounds {
        if (index < 0 || index >= size)
            throw new ListOutOfBounds("The Index Is Out Of Valid Range!!!!");
        Node<E> dummy = head;
        int ans = -1, i = 0;
        for (i = 0; i < index; i ++)
            dummy = dummy.next;
        for (; dummy != null; i ++) {
            if (Objects.equals(dummy.value, value))
                ans = i;
            dummy = dummy.next;
        }
        return ans;
    }

    @Finding
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
