package dsa.linked_list.making_my_own;

public interface List<E> {
    int getSize ();
    E getEle (int index);
    void addFirst (E value);
    void addLast (E value);
    void add (E value);
    E removeLast ();
    E removeFirst ();
    boolean contains (E value);
    int indexOf (E value);
    int indexOf (int index, E value);
    int lastIndexOf (E value);
    int lastIndexOf(int index, E value);
    void display ();
    void display (int index);
    E getFirst ();
    E getLast ();
    E remove (int index);
    void add (int index, E value);
    E set (int index, E value);
    String toString ();
    boolean isEmpty ();
    E[] toArray ();
    E[] toArray (int index);
    boolean isSingle ();
    java.util.ArrayList<E> asList ();
    java.util.ArrayList<E> asList (int index);
    void clear ();
}
