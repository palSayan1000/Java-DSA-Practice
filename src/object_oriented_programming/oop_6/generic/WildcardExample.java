package object_oriented_programming.oop_6.generic;

import java.util.Arrays;
import java.util.List;

// Here T should eather be Number or its Subclasses
public class WildcardExample<E extends Number> {
    // the E and the T are the same E -> Element and T -> Type

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public WildcardExample(int capacity) {
        this.data = new Object[capacity];
        // Note: size remains 0 because no elements have been added yet
    }

    public void getList(List<?extends Number> list) {
        // do something
    }

    public void add(E item) {
        if (isFull()) {
            reSize();
        }
        data[size++] = item;
    }

    private void reSize() {
        Object[] temp = new Object[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @SuppressWarnings("unchecked")
    public E getFirst() {
        return (E) data[0];
    }

    @SuppressWarnings("unchecked")
    public E getLast() {
        return (E) data[size - 1];
    }

    @SuppressWarnings("unchecked")
    public E removeFirst() {
        E temp = (E) data[0];
        for (int i = 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        data[--size] = null; // Clear reference to avoid memory leak
        return temp;
    }

    @SuppressWarnings("unchecked")
    public E removeLast() {
        E temp = (E) data[size - 1];
        data[--size] = null;
        return temp;
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        E temp = (E) data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        data[--size] = null; // Bugfix: Decrement size after removing an element
        return temp;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) data[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @SuppressWarnings("unchecked")
    // Bugfix: Parameter type changed from int to E
    public E set(int index, E value) {
        E temp = (E) data[index];
        data[index] = value;
        return temp;
    }

    @Override
    public String toString() {
        // Only print elements up to `size` instead of empty array slots
        Object[] activeElements = Arrays.copyOf(data, size);
        return "CustomArrayList{" + "data=" + Arrays.toString(activeElements) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        WildcardExample<Integer> list = new WildcardExample<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(10);

//        WildcardExample<String> lst = new WildcardExample<>();
//        lst.add("Sayan");
//        lst.add("Bal");
//        lst.add("Pal");
        // String cannot be added as type restricted generic

//        System.out.println(lst);
        System.out.println(list);
    }
}