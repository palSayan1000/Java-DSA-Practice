package dsa.linked_list.understanding;

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
}
