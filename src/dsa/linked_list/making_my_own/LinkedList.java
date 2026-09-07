package dsa.linked_list.making_my_own;

import java.sql.SQLOutput;
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
        if (isEmpty())
            throw new ListEmpty("The List Is Empty!!!");
        if (index < 0 || index >= size)
            throw new ListOutOfBounds("Index Out Of Bounds!!!!");

        Node<E> dummy = head;
        for (int i = 0; i < index; i ++)
            dummy = dummy.next;

        return dummy;
    }

    @Override @Get // returns the size of the linked list
    public int getSize () {
        return size;
    }

    @Override @Get // returns the value of the node at the specified index
    public E getEle (int index) throws ListOutOfBounds {
        return nthNode(index).value;
    }

    @Override @Get // returns the value of the first node
    public E getFirst () throws ListEmpty {
        if (isEmpty())
            throw new ListEmpty("List Is Empty Bro!!!");

        return head.value;
    }

    @Override @Get // returns the value of the last node
    public E getLast () throws ListEmpty {
        if (isEmpty())
            throw new ListEmpty("List Is Empty Bro!!!");

        return tail.value;
    }

    @Override @Adding // adds a node to the linked in the first
    public void addFirst (E value) {
        Node<E> node = new Node<>(value);
        node.next = head;
        head = node;
        // Node<E> node = new Node<>(value, head); -> can do the above thing directly
        if (tail == null)
            tail = head;

        size ++;
    }

    @Override @Adding // adds a node to the linked list at the last
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

    @Override @Adding // adds a node at the specified index
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

    @Override @Deleting // deletes the last node
    public E removeLast () throws ListEmpty{
        if (isEmpty())
            throw new ListEmpty("The LinkedList Is Empty!!!");
        if (isSingle())
            return removeFirst();

        tail = nthNode (size - 2);
        Node<E> temp = tail.next;
        tail.next = null;
        size --;

        return temp.value;
    }

    @Override @Deleting // deletes the first node
    public E removeFirst () throws ListEmpty{
        if (isEmpty())
            throw new ListEmpty("The LinkedList Is Empty!!!");
        if (isSingle())
            head = tail = null;

        Node<E> temp = head;
        head = head.next;
        size --;

        return temp.value;
    }

    @Override @Deleting // deletes the node at the specified index
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

    @Override // sets the node value at the specified index with the provided value
    public E set (int index, E value) throws LinkedListException {
        Node<E> dummy = nthNode(index);
        E temp = dummy.value;
        dummy.value = value;
        return temp;
    }

    @Override @Finding // indexOf from the given index
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

    @Override @Finding // lastIndexOf before the given index
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

    @Override @Display // displays the linked list from the given index
    public void display (int index) throws LinkedListException{
        Node<E> dummy = nthNode (index);
        while (dummy != null) {
            System.out.print(dummy.value + " --> ");
            dummy = dummy.next;
        }
        System.out.println("null");
    }

    @Override @Converting// converts the list to a formated string
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        Node<E> dummy = head;
        while (dummy != null) {
            sb.append(dummy.value).append(", ");
            dummy = dummy.next;
        }
        sb.append("null ]");
        return sb.toString();
    }

    @Override @Converting // Converting a LinkedList to an array but from a specified index
    public E[] toArray (int index) throws ListOutOfBounds{
        if (size == 0)
            return (E[])(new Object[0]);
        if (index < 0 || index >= size)
            throw new ListOutOfBounds("Invalid Index Bitch!!!");
        Node<E> dummy = head;
        E[] array = (E[]) new Object[size - index];
        for (int i = 0, k = 0; i < size; i ++) {
            if (i >= index) {
                array[k ++] = dummy.value;
            }
            dummy = dummy.next;
        }
        return array;
    }

    @Override @Converting // Converting a LinkedList to arrayList but from the specified index
    public java.util.ArrayList<E> asList (int index) throws ListOutOfBounds{
        if (size == 0)
            return new java.util.ArrayList<E>();
        if (index < 0 || index >= size)
            throw new ListOutOfBounds("Invalid Index Bitch!!!");
        Node<E> dummy = head;
        java.util.ArrayList<E> list = new java.util.ArrayList<>();
        for (int i = 0; i < size; i ++) {
            if (i >= index) {
                list.add(dummy.value);
            }
            dummy = dummy.next;
        }
        return list;
    }

    @Override
    public void clear () {
        head = tail = null;
        size = 0;
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

        @Override
        protected void finalize() throws Throwable {
            System.out.println("The node object is being deleted!!!1");
        }
    }
}
