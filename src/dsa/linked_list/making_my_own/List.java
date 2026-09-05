package dsa.linked_list.making_my_own;

public interface List<E> {
    int getSize ();
    E getEle (int index);
    void addFirst (E value);
    void addLast (E value);
    E removeLast ();
    E removeFirst ();
    boolean contains (E value);
    int indexOf (E value);
    int indexOf (int index, E value);
    int lastIndexOf (E value);
    int lastIndexOf(int index, E value);
    void display ();
    void display (E node);
    E getFirst ();
    E getLast ();
    E remove (int index);
    void add (int index, E value);
    E set (int index, E value);
    String toString ();
}
