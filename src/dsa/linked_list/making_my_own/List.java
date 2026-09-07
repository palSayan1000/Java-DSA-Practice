package dsa.linked_list.making_my_own;

@SuppressWarnings("JavadocDeclaration")
public interface List<E> {
    // ---------- Size / State ----------

    /**
     * Returns the total number of elements currently in the list
     *
     * @return int
     */
    int getSize ();

    /**
     * Returns true if the linked list is empty else false
     *
     * @return boolean
     */
    default boolean isEmpty () { // checks if the list is empty
        return getSize() == 0;
    }

    /**
     * Returns true if there is only one element in the linked list
     *
     * @return boolean
     */
    default boolean isSingle () {
        return getSize() == 1;
    }

    // ---------- Access ----------

    /**
     * Returns the node value of a specific index
     *
     * @param index
     * @return E
     * @throws ListOutOfBounds
     */
    E getEle (int index) throws ListOutOfBounds;

    /**
     * Returns the node value of the first index
     *
     * @return E
     * @throws ListOutOfBounds
     */
    E getFirst () throws ListEmpty;

    /**
     * Returns the node value of the last index
     *
     * @return E
     * @throws ListOutOfBounds
     */
    E getLast () throws ListEmpty;

    // ---------- Insertion ----------

    /**
     * Adds an element at the first index of the linked list
     *
     * @param value
     */
    void addFirst (E value);

    /**
     * Adds an element at the last index of the linked list
     *
     * @param value
     */
    void addLast (E value);

    /**
     * Adds an element at the last index of the linked list
     *
     * @param value
     */
    default void add (E value) {
        addLast(value);
    }

    /**
     * Adds an element at the specific index of the linked list
     *
     * @param index
     * @param value
     * @throws LinkedListException
     */
    void add (int index, E value) throws LinkedListException;

    // ---------- Deletion ----------

    /**
     * Removes the first element of the linked list
     *
     * @return E
     * @throws ListEmpty
     */
    E removeFirst () throws ListEmpty;

    /**
     * Removes the last element of the linked list
     *
     * @return E
     * @throws ListEmpty
     */
    E removeLast () throws ListEmpty;

    /**
     * Removes the last element of the linked list
     *
     * @return E
     * @throws ListEmpty
     */
    default E remove () throws ListEmpty {
        return removeLast();
    }

    /**
     * Removes the element of the specified index of the linked list
     *
     * @param index
     * @return E
     * @throws LinkedListException
     */
    E remove (int index) throws LinkedListException;

    /**
     * Empty the linked list
     */
    void clear ();

    // ---------- Modification ----------

    /**
     * Sets the value of the specific index with the provided value of the linked list
     *
     * @param index
     * @param value
     * @return E
     * @throws LinkedListException
     */
    E set (int index, E value) throws LinkedListException;

    // ---------- Search ----------

    /**
     * Checks if the value for a value in the linked list
     *
     * @param value
     * @return boolean
     */
    default boolean contains (E value) { // checks if a value contains in the linked list
        return indexOf(value) != -1;
    }

    /**
     * Checks for a value in the linked list
     *
     * @param value
     * @return int
     */
    default int indexOf (E value) { // indexOf on the linked list
        if (isEmpty())
            return -1;
        return indexOf (0, value);
    }

    /**
     * Checks for a value from the specified index
     *
     * @param index
     * @param value
     * @return int
     */
    int indexOf (int index, E value);

    /**
     * Checks for a value in the linked list from the last
     *
     * @param value
     * @return int
     */
    default int lastIndexOf (E value) { // last-indexOf at the linked list
        if (isEmpty())
            return -1;
        return lastIndexOf (getSize() - 1, value);
    }

    /**
     * Checks for a value in the linked list from the specified index from the last
     *
     * @param index
     * @param value
     * @return int
     */
    int lastIndexOf (int index, E value);

    // ---------- Display ----------

    /**
     * Displays the linked list
     * <p>
     /// @throws LinkedListException
     */
    default void display () throws LinkedListException {
        display (0);
    }

    /**
     * Displays the linked list from a specified index
     *
     * @param index
     * @throws LinkedListException
     */
    void display (int index) throws LinkedListException;

    /**
     * Converts the linked list to a string
     *
     * @return String
     */
    String toString ();

    // ---------- Conversion ----------

    /**
     * Converts a Linked list to an Array
     *
     * @return E[]
     * @throws ListOutOfBounds
     */
    default E[] toArray () throws ListOutOfBounds{ // converting a Linked List to array
        return toArray (0);
    }

    /**
     * Converts a Linked list to an Array
     *
     * @return E[]
     * @throws ListOutOfBounds
     */
    E[] toArray (int index) throws ListOutOfBounds;

    /**
     * Converts a Linked List to an array list
     *
     * @return
     * @throws ListOutOfBounds
     */
    default java.util.ArrayList<E> asList () throws ListOutOfBounds{
        return asList (0);
    }

    /**
     * Converts a Linked list to an ArrayList from the given index
     *
     * @return E[]
     * @throws ListOutOfBounds
     */
    java.util.ArrayList<E> asList (int index) throws ListOutOfBounds;
}
